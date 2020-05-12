import routes from './routes.js';

function route(){

    const {root: defaultRoute} = routes;
    


    const {init} = 
        Object.values(routes).find(({path}) => 
        window.location.hash.startsWith(path)
    ) || defaultRoute;

    init();
};

window.onhashchange = route;

route();