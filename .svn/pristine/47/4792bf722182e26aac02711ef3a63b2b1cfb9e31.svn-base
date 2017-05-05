	// create the module and name it scotchApp
	var scotchApp = angular.module('scotchApp', ['ngRoute']);

	// configure our routes
	scotchApp.config(function($routeProvider) {
		$routeProvider

			// route for the home page
			.when('/', {
				templateUrl : 'pages/home.html',
				controller  : 'mainController'
			})

			// route for the about page
			.when('/about', {
				templateUrl : 'pages/SearchActor.html',
				controller  : 'aboutController'
			})

			// route for the contact page
			.when('/contactt', {
				templateUrl : 'pages/UpdateActor.html',
				controller  : 'contactController'
            })

			// route for the contact page
			.when('/removeactor', {
				templateUrl : 'pages/RemoveActor.html',
				controller  : 'removeactorController'
            })

			// route for the contact page
			.when('/listofactors', {
				templateUrl : 'GetAllActor.html',
				controller  : 'listofactorsController'
            
			})
             .when('/addfilm', {
				templateUrl : 'pages/AddFilm.html',
				controller  : 'addfilmController'
            })
             .when('/searchfilm', {
				templateUrl : 'pages/SearchFilmByActor.html',
				controller  : 'searchfilmController'
            })
             .when('/updatefilm', {
				templateUrl : 'pages/UpdateFilm.html',
				controller  : 'updatefilmController'
            })
             .when('/removefilm', {
				templateUrl : 'pages/RemoveFilm.html',
				controller  : 'removefilmController'
            })
             .when('/searchfilmbytitle', {
				templateUrl : 'pages/SearchByTitle.html',
				controller  : 'searchfilmbytitleController'
            
            })
             .when('/searchfilmbyreleaseyear', {
				templateUrl : 'pages/SearchByReleaseYear.html',
				controller  : 'searchfilmbyreleaseyearController'
            })
             .when('/searchfilmbyrating', {
				templateUrl : 'pages/SearchByRating.html',
				controller  : 'searchfilmbyratingController'
            })
             .when('/searchfilmbylanguage', {
				templateUrl : 'pages/SearchByLanguage.html',
				controller  : 'searchfilmbylanguageController'
             })
             .when('/searchfilmbycategory', {
				templateUrl : 'pages/SearchByCategory.html',
				controller  : 'searchfilmbycategoryController'
            })
             .when('/listoffilms', {
				templateUrl : 'GetAllFilm.html',
				controller  : 'listoffilmsController'
			})
		.when('/add', {
			templateUrl : 'pages/addActor.html',
			controller  : 'addActorController'
        });
		   
        
	});

	
	scotchApp.controller('addActorController', function($scope) {
		// create a message to display in our view
		$scope.message = 'You are on main page';
	});
	
	// create the controller and inject Angular's $scope
	scotchApp.controller('mainController', function($scope) {
		// create a message to display in our view
		$scope.message = 'You are on main page';
	});

	scotchApp.controller('aboutController', function($scope) {
		$scope.message = 'You are on about page.';
	});

	scotchApp.controller('contactController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
        
        
	});
scotchApp.controller('removeactorController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
         
	});
scotchApp.controller('listofactorsController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
	});
scotchApp.controller('addfilmController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
    });
scotchApp.controller('searchfilmController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
    });
scotchApp.controller('updatefilmController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
    
     });
scotchApp.controller('removefilmController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
    });
scotchApp.controller('searchfilmbytitleController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
     });
scotchApp.controller('searchfilmbyreleaseyearController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
    });
scotchApp.controller('searchfilmbyratingController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
    });
scotchApp.controller('searchfilmbylanguageController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
    });
scotchApp.controller('searchfilmbycategoryController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
    });
scotchApp.controller('listoffilmsController', function($scope) {
		$scope.message = 'Contact us! . This is just a demo.';
    
    
	});




function SearchByReleaseYearController($scope, $http)
{
	$scope.rYear;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;

	$scope.createFilm = function() 
	{
		/*$http({
      method: 'GET',
      url: ' http://localhost:9999/FMSLa/ServletForAddActor',
      headers: {'Content-Type': 'application/json'},
      data:  $scope.rYear
    }).success(function (data) 
      {
    	$scope.status=data;
      });*/

		$http.get('http://localhost:9999/FMSLa/SearchByReleaseYearServlet'+'?sbr='+$scope.rYear).success(function (data) {

			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
		});


	};
}

function SearchByRatingController($scope, $http)
{
	$scope.rating;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;

	$scope.searchFilmByRating= function() 
	{
		/*$http({
        method: 'GET',
        url: ' http://localhost:9999/FMSLa/ServletForAddActor',
        headers: {'Content-Type': 'application/json'},
        data:  $scope.rYear
      }).success(function (data) 
        {
      	$scope.status=data;
        });*/

		$http.get('http://localhost:9999/FMSLa/SearchByRatingServlet'+'?sbr='+$scope.rating).success(function (data) {

			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
		});


	};


}

function SearchByCategoryController($scope, $http)
{
	$scope.catg;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;

	$scope.searchFilmByCategory= function() 
	{
		/*$http({
        method: 'GET',SearchByCategoryController
        url: ' http://localhost:9999/FMSLa/ServletForAddActor',
        headers: {'Content-Type': 'application/json'},
        data:  $scope.rYear
      }).success(function (data) 
        {
      	$scope.status=data;
        });*/

		$http.get('http://localhost:9999/FMSLa/ServletForSearchByCategory'+'?sbc='+$scope.catg).success(function (data) {

			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
		});


	};


}

function SearchByTitleController($scope, $http)
{
	$scope.actorList = [];
	$scope.title;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;
	$scope.ActorFName;

	$scope.searchFilmByTitle= function() 
	{
		/*$http({
        method: 'GET',SearchByCategoryController
        url: ' http://localhost:9999/FMSLa/ServletForAddActor',
        headers: {'Content-Type': 'application/json'},
        data:  $scope.rYear
      }).success(function (data) 
        {
      	$scope.status=data;
        });*/

		$http.get('http://localhost:9999/FMSLa/ServletForSearchByTitle'+'?sbt='+$scope.title).success(function (data) {

			
			
			
			
			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
			$scope.ActorFName="Actor Lists";
			
			
			
		});


	};


}

function SearchByLanguageController($scope, $http)
{
	$scope.actorList = [];
	$scope.lang;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;
	$scope.ActorFName;
	$scope.ActorImage;

	$scope.searchFilmByLanguage= function() 
	{
		

		$http.get('http://localhost:9999/FMSLa/ServletForSearchByLanguage'+'?sbl='+$scope.lang).success(function (data) {

			
			
			
			
			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
			$scope.ActorFName="Actor Lists";
			$scope.ActorImage="Image Of The Actor";
			$scope.CatName="Category Name";
			
		});
	};
}

function SearchByActorController($scope, $http)
{
	
	$scope.fname;
	$scope.lname;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;
	$scope.ActorFName;
	$scope.ActorImage;

	$scope.searchFilmByActor= function() 
	{
		

		$http.get('http://localhost:9999/FMSLa/SearchFilmByActorServlet'+'?sbafn='+$scope.fname+'&sbaln='+$scope.lname).success(function (data) {

			
			
			
			
			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
			$scope.ActorFName="Actor Lists";
			$scope.ActorImage="Image Of The Actor";
			$scope.CatName="Category Name";
			
		});
	};
}
function RemoveFilmController($scope, $http)
{
	$scope.film = {};

	$scope.RemoveFilm = function() 
	{
		$http({
			method: 'POST',
			url: ' http://localhost:9999/FMSLa/ServletForRemoveFilm',
			headers: {'Content-Type': 'application/json'},
			data:  $scope.film
		}).success(function (data) 
				{
			$scope.status=data;
				});
	};
}


function UpdateFilmController($scope, $http)
{
	$scope.film = {};

	$scope.UpdateFilm = function() 
	{
		$http({
			method: 'POST',
			url: ' http://localhost:9999/FMSLa/ServletForUpdateFilm',
			headers: {'Content-Type': 'application/json'},
			data:  $scope.film
		}).success(function (data) 
				{
			$scope.status=data;
				});
	};
}

function FilmController($scope, $http)
{
	$scope.film = {};

	$scope.createFilm = function() 
	{
		$http({
			method: 'POST',
			url: ' http://localhost:9999/FMSLa/AddFilmServlet',
			headers: {'Content-Type': 'application/json'},
			data:  $scope.film
		}).success(function (data) 
				{
			$scope.status=data;
				});
	};
}

function GetFilmController($scope, $http)
{
	$scope.fname;
	$scope.lname;
	$scope.films=[];
	$scope.Title;
	$scope.Description;
	$scope.Release_Year;
	$scope.Length_In_Minute;
	$scope.Language_Name;
	$scope.Rating;
	$scope.ActorFName;
	$scope.ActorImage;

	$scope.GetFilm= function() 
	{
		/*$http({
        method: 'GET',
        url: ' http://localhost:9999/FMSLa/ServletForAddActor',
        headers: {'Content-Type': 'application/json'},
        data:  $scope.rYear
      }).success(function (data) 
        {
      	$scope.status=data;
        });*/

		$http.get('http://localhost:9999/FMSLa/ServletForGetAllFilm').success(function (data) {

			console.log("Received");
			$scope.status=data;
			$scope.films = data;
			$scope.Title="Title";
			$scope.Description="Description";
			$scope.Release_Year="Release Year";
			$scope.Length_In_Minute="Length In Minute";
			$scope.Language_Name="Language Name";
			$scope.Rating="Rating";
			$scope.ActorFName="Actor Lists";
			$scope.ActorImage="Image Of The Actor";
			$scope.CatName="Category Name";
		});


	};

}
function GetActorController($scope, $http)
{
	
	$scope.fname;
	$scope.actors=[];
	
	$scope.ActorFName;
	$scope.ActorLName;
	$scope.ActorDob;
	$scope.ActorImage;
	

	$scope.GetActor= function() 
	{
		

		$http.get('http://localhost:9999/FMSLa/GetAllActorServlet').success(function (data) {

			
			
			
			
			console.log("Received");
			$scope.status=data;
			$scope.actors = data;
			$scope.ActorFName="First Name";
			$scope.ActorLName="Last Name";
			$scope.ActorDob="Date Of Birth";
			$scope.ActorImage="Actor Image";
			
		});
	};
}


