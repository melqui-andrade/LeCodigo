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
        (`lecodigo`.`respostadoaluno` `r`
        JOIN `lecodigo`.`questao` `q` ON ((`r`.`id_questao` = `q`.`id`)))
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
        (((`lecodigo`.`jogador` `j`
        LEFT JOIN `lecodigo`.`partida` `p` ON ((`p`.`id_jogador` = `j`.`id`)))
        LEFT JOIN `lecodigo`.`respostadoaluno` `r` ON ((`r`.`id_partida` = `p`.`id`)))
        LEFT JOIN `lecodigo`.`questao` `q` ON ((`r`.`id_questao` = `q`.`id`)))
    WHERE
        ((`q`.`resposta` IS NOT NULL)
            AND (`q`.`tipo_questao` <> 0))
    ORDER BY `j`.`nome`;