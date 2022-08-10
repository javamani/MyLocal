June 01,2022

https://www.udemy.com/course/the-complete-guide-to-angular-2/?src=sac&kw=Angular

Angular:
	Angular is one of the most powerful and performance-efficient open source JavaScript frameworks to build single-page applications for both web and mobile.
	Angular is completely rewritten and not an upgrade from Angular 1.

Need of Angular or why we need to move from Angular 1 to Angular:
	* Angular 1 is not cross browser compliant.
	* Angular is written in Typescript language , this is superset of Javascript language.
	* Angular supports component based development.
	* Angular supports both desktop & mobile applications.
	* Angular provides better performance in terms of browser rendering,animation and accessibility.

what is Angular:
	SPA:
		It is a web application that interacts with the user by dynamically redrawing any part of the UI without requesting an entirely new page from the server.
		Ex : Amazon is not a SPA, where as GMail is SPA.
		Angular helps in building SPAs by loading HTML conents dynamically in a single page and provide a illusion to the user that application is a single page.

Latest version :
	Angular 13 as of June 01 , 2022.

Features of Angular:
		TypeScript code is compiled to JavaScript code using build tools like npm, bower, gulp, webpack

1) Components.
	Components:
			Angular follows component-based programming which is the future of web development
			Inside a component, you can write both business logic and view.
			Every Angular application must have one top-level component referred to as 'Root Component' and several sub-components or child components
	Modules
	Templates


2) Directives:	
	Structural Directives
	Attribute Directives


3) Data-Bindings:
	one-Way data bindings
	2-way data bindings


4) Pipes:
	Built-in pipes.
	Custom pipes

5) Nested components:
		Data sharing between components.
		components life cycle.

6) Forms
		Template Driven forms.
		Reactive forms.
		custom validators.

7) Routing:
		Routing.
		Route Guards
		Aysnchronous Routing.

6) Services:
	Custom services.
	HttpClient
	Observables.

Application Setup: [06/21/2022]

node -v 
	Node : 14.15.3
npm -v
	6.14.9
ng --version 
	Locally having : Angular CLI 11.0.5

npm install -g @angular/cli   installs angular cli globally.
ng new <projectname>          creates a new project.
ng serve --open  builds and run the application on a lite server and launches a browser.
ng generate <name> generates component modules 
ng build  builds the application
ng update @angular/cli @angular/core Updates angular to a newer version.

Folder Structure:

node_modules/ Node.js creates this folder and puts all npm modules installed as listed in package.json
src/     All application-related files will be stored inside it
angular.json  Configuration file for Angular CLI where we set several defaults and also configure what files to be included during project build
package.json  This is a node configuration file that contains all dependencies required for Angular
tsconfig.json This is the Typescript configuration file where we can configure compiler options
.angular From Angular version 13.0.0, .angular folder is generated in the root. This folder caches the builds and is ignored by git.


