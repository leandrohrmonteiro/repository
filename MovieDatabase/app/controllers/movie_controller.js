import {getMovie} from '../services/api.js';
import movieView from '../views/movie_view.js'
import {selectedMovie} from '../views/root.js'

export default function(){

    const movie = getMovie(selectedMovie());
    movieView(movie);
};