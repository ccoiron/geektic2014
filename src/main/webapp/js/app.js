var app = angular.module("geektic", [ 'ngRoute' ]);

app.controller('HelloCtrl', function($scope, $http) {
	$http.get('/api/hello').success(function(helloMessage) {
		$scope.helloMessage = helloMessage;
	});
});

app.controller('UsersCtrl', function($scope, $http) {
	$http.get('http://localhost:8080/utilisateur').success(
			function(data, status, headers, config) {
				$scope.users = data;
			});
});

app.controller('rechercheCtrl', function($scope, $http) {
    $http.get('http://localhost:8080/centreinteret').success(function(data, status, headers, config) {
        $scope.cis = data;
    });
});


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
	      });;

} ]);
