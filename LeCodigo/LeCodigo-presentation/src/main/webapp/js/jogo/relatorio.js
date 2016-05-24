function carregaVariaveisHistoricoGeral(acertos,erros,pulo) {

	/* CHART HISTORICO */
	var ctx = document.getElementById("chartHistorico");	
	var data = {
		    labels: [
		        "Acertos",
		        "Erros",
		        "Pulos"
		    ],
		    datasets: [
		        {
		            data: [acertos, erros, pulo],
		            backgroundColor: [
		                "#36A2EB",
		                "#FF6384",
		                "#FFCE56"
		            ],
		            hoverBackgroundColor: [
		                 "#36A2EB",
		                "#FF6384",
		                "#FFCE56"
		            ]
		        }]
		};
	
	var options = {
		    segmentShowStroke: false,
		    animateRotate: true,
		    animateScale: false,
		    percentageInnerCutout: 50,
		    tooltipTemplate: "<%= value %>%"
		}
	
	var myPieChart = new Chart(ctx,{
	    type: 'pie',
	    data: data,	
	    options: options
	    
	});	
	Chart.defaults.global.responsive = true;
	
}

function carregaVariaveisHistoricoF1(acertos,erros,pulo) {

	/* CHART FASE 1 */
	var ctx = document.getElementById("chartFase1");	
	
	var data = {
		    labels: ["Acertos",
				        "Erros",
				        "Pulos"],
		    datasets: [
		        {
		            label: "Fase 1",
		            backgroundColor: "rgba(255,99,132,0.2)",
		            borderColor: "rgba(255,99,132,1)",
		            borderWidth: 1,
		            hoverBackgroundColor: "rgba(255,99,132,0.4)",
		            hoverBorderColor: "rgba(255,99,132,1)",
		            data: [acertos, erros, pulo],
		        }
		    ]
		};
	
	
	var myPieChart = new Chart(ctx,{
	    type: 'bar',
	    data: data,	  	    
	    
	});	
	
	
}

function carregaVariaveisHistoricoF2(acertos,erros,pulo) {

	/* CHART FASE 2 */
	var ctx = document.getElementById("chartFase2");	
	
	var data = {
		    labels: ["Acertos",
				        "Erros",
				        "Pulos"],
		    datasets: [
		        {
		            label: "Fase 2",
		            backgroundColor: "rgba(255,99,132,0.2)",
		            borderColor: "rgba(255,99,132,1)",
		            borderWidth: 1,
		            hoverBackgroundColor: "rgba(255,99,132,0.4)",
		            hoverBorderColor: "rgba(255,99,132,1)",
		            data: [acertos, erros, pulo],
		        }
		    ]
		};
	
	
	var myPieChart = new Chart(ctx,{
	    type: 'bar',
	    data: data,	  	    
	    
	});	
	
	
}

function carregaVariaveisHistoricoF3(acertos,erros,pulo) {
	/* CHART FASE 1 */
	var ctx = document.getElementById("chartFase3");		
	var data = {
		    labels: ["Acertos",
				        "Erros",
				        "Pulos"],
		    datasets: [
		        {
		            label: "Fase 3",
		            backgroundColor: "rgba(255,99,132,0.2)",
		            borderColor: "rgba(255,99,132,1)",
		            borderWidth: 1,
		            hoverBackgroundColor: "rgba(255,99,132,0.4)",
		            hoverBorderColor: "rgba(255,99,132,1)",
		            data: [acertos, erros, pulo],
		        }
		    ]
		};	
	var myPieChart = new Chart(ctx,{
	    type: 'bar',
	    data: data,	  	    
	    
	});		
}

function carregaVariaveisHistorico_if_else(acertos,erros,pulo) {
	/* CHART FASE 1 */
	var ctx = document.getElementById("chartIfElse");		
	var data = {
		    labels: ["Acertos",
				        "Erros",
				        "Pulos"],
		    datasets: [
		        {
		            label: "IF/ELSE",
		            backgroundColor: "rgba(255,99,132,0.2)",
		            borderColor: "rgba(255,99,132,1)",
		            borderWidth: 1,
		            hoverBackgroundColor: "rgba(255,99,132,0.4)",
		            hoverBorderColor: "rgba(255,99,132,1)",
		            data: [acertos, erros, pulo],
		        }
		    ]
		};	
	var myPieChart = new Chart(ctx,{
	    type: 'bar',
	    data: data,	  	    
	    
	});		
}

function carregaVariaveisHistorico_tipo_atribuicao(acertos,erros,pulo) {
	/* CHART FASE 1 */
	var ctx = document.getElementById("chartTipoAtribuicao");		
	var data = {
		    labels: ["Acertos",
				        "Erros",
				        "Pulos"],
		    datasets: [
		        {
		            label: "Tipos e Atribuição de variaveis",
		            backgroundColor: "rgba(255,99,132,0.2)",
		            borderColor: "rgba(255,99,132,1)",
		            borderWidth: 1,
		            hoverBackgroundColor: "rgba(255,99,132,0.4)",
		            hoverBorderColor: "rgba(255,99,132,1)",
		            data: [acertos, erros, pulo],
		        }
		    ]
		};	
	var myPieChart = new Chart(ctx,{
	    type: 'bar',
	    data: data,	  	    
	    
	});		
}

function carregaVariaveisHistorico_switch_case(acertos,erros,pulo) {
	/* CHART FASE 1 */
	var ctx = document.getElementById("chartSwitchCase");		
	var data = {
		    labels: ["Acertos",
				        "Erros",
				        "Pulos"],
		    datasets: [
		        {
		            label: "Switch/case",
		            backgroundColor: "rgba(255,99,132,0.2)",
		            borderColor: "rgba(255,99,132,1)",
		            borderWidth: 1,
		            hoverBackgroundColor: "rgba(255,99,132,0.4)",
		            hoverBorderColor: "rgba(255,99,132,1)",
		            data: [acertos, erros, pulo],
		        }
		    ]
		};	
	var myPieChart = new Chart(ctx,{
	    type: 'bar',
	    data: data,	  	    
	    
	});		
}

function carregaVariaveisHistorico_for(acertos,erros,pulo) {
	/* CHART FASE 1 */
	var ctx = document.getElementById("chartFor");		
	var data = {
		    labels: ["Acertos",
				        "Erros",
				        "Pulos"],
		    datasets: [
		        {
		            label: "For",
		            backgroundColor: "rgba(255,99,132,0.2)",
		            borderColor: "rgba(255,99,132,1)",
		            borderWidth: 1,
		            hoverBackgroundColor: "rgba(255,99,132,0.4)",
		            hoverBorderColor: "rgba(255,99,132,1)",
		            data: [acertos, erros, pulo],
		        }
		    ]
		};	
	var myPieChart = new Chart(ctx,{
	    type: 'bar',
	    data: data,	  	    
	    
	});		
}

function carregaVariaveisHistorico_while(acertos,erros,pulo) {
	/* CHART FASE 1 */
	var ctx = document.getElementById("chartWhile");		
	var data = {
		    labels: ["Acertos",
				        "Erros",
				        "Pulos"],
		    datasets: [
		        {
		            label: "While",
		            backgroundColor: "rgba(255,99,132,0.2)",
		            borderColor: "rgba(255,99,132,1)",
		            borderWidth: 1,
		            hoverBackgroundColor: "rgba(255,99,132,0.4)",
		            hoverBorderColor: "rgba(255,99,132,1)",
		            data: [acertos, erros, pulo],
		        }
		    ]
		};	
	var myPieChart = new Chart(ctx,{
	    type: 'bar',
	    data: data,	  	    
	    
	});		
}

function carregaVariaveisHistorico_do_While(acertos,erros,pulo) {
	/* CHART FASE 1 */
	var ctx = document.getElementById("chartDoWhile");		
	var data = {
		    labels: ["Acertos",
				        "Erros",
				        "Pulos"],
		    datasets: [
		        {
		            label: "do While",
		            backgroundColor: "rgba(255,99,132,0.2)",
		            borderColor: "rgba(255,99,132,1)",
		            borderWidth: 1,
		            hoverBackgroundColor: "rgba(255,99,132,0.4)",
		            hoverBorderColor: "rgba(255,99,132,1)",
		            data: [acertos, erros, pulo],
		        }
		    ]
		};	
	var myPieChart = new Chart(ctx,{
	    type: 'bar',
	    data: data,	  	    
	    
	});		
}

function carregaVariaveisHistorico_troca_de_variaveis(acertos,erros,pulo) {
	/* CHART FASE 1 */
	var ctx = document.getElementById("chartTrocaDeVariaveis");		
	var data = {
		    labels: ["Acertos",
				        "Erros",
				        "Pulos"],
		    datasets: [
		        {
		            label: "Troca de variaveis",
		            backgroundColor: "rgba(255,99,132,0.2)",
		            borderColor: "rgba(255,99,132,1)",
		            borderWidth: 1,
		            hoverBackgroundColor: "rgba(255,99,132,0.4)",
		            hoverBorderColor: "rgba(255,99,132,1)",
		            data: [acertos, erros, pulo],
		        }
		    ]
		};	
	var myPieChart = new Chart(ctx,{
	    type: 'bar',
	    data: data,	  	    
	    
	});		
}

function carregaVariaveisHistorico_ordenacao(acertos,erros,pulo) {
	/* CHART FASE 1 */
	var ctx = document.getElementById("chartOrdenacao");		
	var data = {
		    labels: ["Acertos",
				        "Erros",
				        "Pulos"],
		    datasets: [
		        {
		            label: "Ordenação simples",
		            backgroundColor: "rgba(255,99,132,0.2)",
		            borderColor: "rgba(255,99,132,1)",
		            borderWidth: 1,
		            hoverBackgroundColor: "rgba(255,99,132,0.4)",
		            hoverBorderColor: "rgba(255,99,132,1)",
		            data: [acertos, erros, pulo],
		        }
		    ]
		};	
	var myPieChart = new Chart(ctx,{
	    type: 'bar',
	    data: data,	  	    
	    
	});		
}

function carregaVariaveisHistorico_funcoes(acertos,erros,pulo) {
	/* CHART FASE 1 */
	var ctx = document.getElementById("chartFuncoes");		
	var data = {
		    labels: ["Acertos",
				        "Erros",
				        "Pulos"],
		    datasets: [
		        {
		            label: "Funções",
		            backgroundColor: "rgba(255,99,132,0.2)",
		            borderColor: "rgba(255,99,132,1)",
		            borderWidth: 1,
		            hoverBackgroundColor: "rgba(255,99,132,0.4)",
		            hoverBorderColor: "rgba(255,99,132,1)",
		            data: [acertos, erros, pulo],
		        }
		    ]
		};	
	var myPieChart = new Chart(ctx,{
	    type: 'bar',
	    data: data,	  	    
	    
	});		
}