var app = angular.module('myApp', []);

app.controller('myCtrl', function($scope, $http) {

  $scope.manutencoes = new Object();


$scope.salvar = function() {
  $http.post("http://localhost:8080/manutencoes", {
    'Id':$scope.Id,
    'nome':$scope.nome,
    'categoria':$scope.categoria,
    'data':$scope.data
    
  })
  };   

});
