export default function(apiResponse){

    $('#app').empty()
        
    apiResponse.then(element => {$('#app').prepend($('<p>').attr("id", `moviePlot`).text(` ${element.Plot}`))})
    apiResponse.then(element => {$('#app').prepend($('<img>').attr("src",` ${element.Poster}`))})
    apiResponse.then(element => {$('#app').prepend($('<h1>').text(` ${element.Title}`))})
    
    $('#app').append($("<button>").attr("id", "returnButton").text(`Return to Main`)
    .click(function(){window.location.hash = '#root'}))
    


   
    
};