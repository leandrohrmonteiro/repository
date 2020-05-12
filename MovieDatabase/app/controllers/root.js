import {getList} from '../services/api.js';
import rootView from '../views/root.js'
import {searchMovieResult} from '../views/root.js'


export default function(){
  
    const movieList = getList(searchMovieResult());
    rootView(movieList);
};