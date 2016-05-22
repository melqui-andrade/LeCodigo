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