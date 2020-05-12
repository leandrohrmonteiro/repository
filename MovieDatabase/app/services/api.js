

export async function getList(movieName) {
    const searchList = `http://www.omdbapi.com/?s=${movieName}&apikey=83d0c7a6&`;
    const response = await fetch (searchList);
    const body = await response.json();
    if(!response.ok) {
        throw new Error(body.message);
    }
    console.log(body);
    return body;
}







export async function getMovie(imdbID){
    
    const searchMovie = `http://www.omdbapi.com/?i=${imdbID}&apikey=83d0c7a6`;
    const response = await fetch(searchMovie);
    const body = await response.json();
    if (!response.ok) {
        throw new Error(body.message); // throwing inside async rejects the returned promise
    }
    console.log(body);
    return body;
};


 

