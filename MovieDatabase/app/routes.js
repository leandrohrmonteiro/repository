import root from './controllers/root.js';
import movie from './controllers/movie_controller.js';

export default {
    root: {
        path: '#root',
        init: root
    },

    movie: {
        path: '#movie',
        init: movie
    }

}