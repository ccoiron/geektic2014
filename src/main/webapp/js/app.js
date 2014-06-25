var app = angular.module("geektic", [ 'ngRoute' ]);

app.controller('HelloCtrl', function($scope, $http) {
	$http.get('/api/hello').success(function(helloMessage) {
		$scope.helloMessage = helloMessage;
	});
});

app.controller('UsersCtrl', function($scope, $http) {
	$http.get('/utilisateur').success(
			function(data, status, headers, config) {
				$scope.users = data;
			});
});

app.controller('rechercheCtrl', function($scope, $http) {
    $http.get('/centreinteret').success(function(data) {
        $scope.cis = data;
    });
});

//On route
app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : 'vue/accueil.html',
	}).when('/utilisateurs', {
		templateUrl : 'vue/utilisateurs.html',
		controller : 'UsersCtrl'
	}).when('/utilisateur', {
		templateUrl : 'vue/utilisateur.html',
		controller : 'UserCtrl'
	}).when('/recherche', {
	     templateUrl: 'vue/recherche.html',
	     controller: 'rechercheCtrl'
	      });
} ]);
