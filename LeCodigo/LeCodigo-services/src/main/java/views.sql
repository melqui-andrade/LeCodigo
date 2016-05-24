CREATE 

VIEW `lecodigo`.`respostasdoalunovw` AS
    SELECT 
        `r`.`respostas` AS `respostaDoAluno`,
        `r`.`id_questao` AS `id_questao`,
        `q`.`id` AS `id`,
        `q`.`fase` AS `fase`,
        `q`.`resposta` AS `resportaQuestao`,
        `q`.`tipo_questao` AS `tipo_questao`
    FROM
        (`lecodigo`.`RespostaDoAluno` `r`
        JOIN `lecodigo`.`Questao` `q` ON ((`r`.`id_questao` = `q`.`id`)))
    ORDER BY `r`.`id_questao` , `q`.`fase`;
	
	
CREATE 

VIEW `lecodigo`.`respostasvw` AS
    SELECT 
        `j`.`id` AS `idJogador`,
        `j`.`login` AS `login`,
        `r`.`respostas` AS `respostaDoAluno`,
        `r`.`id_questao` AS `id_questao`,
        `q`.`fase` AS `fase`,
        `p`.`etapa` AS `etapa`,
        `q`.`resposta` AS `resportaQuestao`,
        `q`.`tipo_questao` AS `tipo_questao`
    FROM
        (((`lecodigo`.`Jogador` `j`
        LEFT JOIN `lecodigo`.`Partida` `p` ON ((`p`.`id_jogador` = `j`.`id`)))
        LEFT JOIN `lecodigo`.`RespostaDoAluno` `r` ON ((`r`.`id_partida` = `p`.`id`)))
        LEFT JOIN `lecodigo`.`Questao` `q` ON ((`r`.`id_questao` = `q`.`id`)))
    WHERE
        ((`q`.`resposta` IS NOT NULL)
            AND (`q`.`tipo_questao` <> 0))
    ORDER BY `j`.`nome`;