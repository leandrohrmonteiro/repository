let imdbID = '';
let submittedMovie = window.location.hash;




export default function(apiResponse){

    $('#app').empty() //cleans div at start
    

    $('#app').prepend(
        $("<input>").attr("id", "movieSearchForm")
        .attr("placeholder", "Insert movie title then press enter...")
        .on("keydown", function (key) {  
        var value = this.value; // omit "var" to make it global
        if(key.which == 13) {
        window.location.hash = `#root/${value}`
        submittedMovie = window.location.hash
        }
    })) 
    
    $('#app').prepend($('<h1>').text(`Movie Searcher`))

    //Asyncronous:
    apiResponse.then(element => {
        
        for(let i = 0; i<= element.Search.length; i++){
            $('#app').append($('<h2>').text(` ${element.Search[i].Title}`)) 
            $('#app').append($('<img>').attr("src",` ${element.Search[i].Poster}`))

        $('#app').append($("<button>").attr("id", "goToMovieButton").text(`Go to ${element.Search[i].Title}`)
        .click(function() { 
            window.location.hash = '#movie';
            imdbID = `${element.Search[i].imdbID}`;
        }))
        }    
    })    
};


//Transporting value to controller:
export  function selectedMovie(){
    return imdbID; 
}

export function searchMovieResult(){
    var splitSubmittedMovie = submittedMovie.split("/")
    var searchedMovie = splitSubmittedMovie[1];

    console.log(`SearchedMovie is ${searchedMovie}`)
    return searchedMovie;
}
