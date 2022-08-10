*****1. Docker & kubernetes.
2. Java 8 and java 11
3. Expertise in one of the cloud provider
4. Microserices
5) NOSQL.
UI skills like Angular, React for those interested in UI
2.Openshift 
3.API Gateways like Mulesoft, APIGEE etc 
4.Workflow tools like Appian, Camunda, Activiti etc.

https://angular-templates.io/tutorials/about/learn-angular-from-scratch-step-by-step

Feb 08,2021
************ 2nd round of Learning.

Latest version is Angular 11 -As of Nov 11,2020

To install:

* Modular in Nature.
* Part of view refresh automatically.
* Follows semantic versioning. Major.Minor.patch
		* Majar -> Major changes that may break your prev version and not backward compatible.
		* Minor -> New features that are backward compatible.
		* Patch -> Bug fixes
* Follows Typescript.

www.nodejs.org ,install last stable release

It installs node & npm manager.

node -v
14.15.3

npm -v
6.14.9

ng --version
11.0.5

Learning : https://www.udemy.com/course/angular-mastering-the-basics/learn/lecture/10121022#overview
https://lex.infosysapps.com/web/en/viewer/web-module/lex_auth_0126442677050245122080?collectionId=lex_20858515543254600000&collectionType=Course


cli.angular.io --> helps ot generate building blocks for angular , 
			by just typing commands.
                -->
npm install -g @angular/cli --> to install angular CLI.

ng version --> to understand angular version.

displays angular CLI , add angular path to path variable.

open --> visual studio editor.

view-> intergrated terminal

inside newe angular older

 ng new helloworld
project '' created

cd hello-world
ng serve
compiled successfully

after localhost:4200
-up and running by just few commands

Anuglar architecture/flow:

1) Modules -- Moduels in nature.
          -- collection of moduels.
          -- represent feature.
		Ex : user module , admin modules.
         -- just lines of code cna be imported /exported.
      --every project  minimum 1 root modules is there called app modue
	-- EAch module includes components and services
	-- Modules interact and ultimately render the view in the browser


2) component -- 
      -- controls portion of view on the browser.
  eX: component for side bar , nav , main
     --angular application contains atleast 1 root component - app component by convention.
   - all component nested under the root component.
-- each components has 1 html template representing the view on browser
                   and a class have the logic to control that html template/view.

3) Services - 
		contains the business logic of your application.



back to vs code :
 helloworld:

	package.json:
		contains the dev dependency reqd for angular app to work.
		created when we performed install ng new
		contains some of the scripts also
		npm start internally call ng serve
	source :
		main.ts --entry point for angular application when application starts.
	app 
		app.module.ts -- root module
		app.component.ts -- root component.


Flow of Execution:
-------------------
Angular app --> collection of one or more modules.
Modules --> Collection of component and services.
Component -> combination of html templates and class
Services > holds the business logic.

To start : on execution of ng serve or npm start
1) Execution control comes to ->main.ts ,here we bootstrap the app module.
2) from app modules goes to component - where we bootstrap app component
3) From app component - we have html template & class.
		main.ts --> bootstrap app modules --> app component (includes  html template (app.component.html)& class(app.component.ts))
                                                  --> app component -class includes property called title
						  -- this will be used in Html template and value will be 
					   -- replaced dynamically.


Components:

	made of 3 parts

	template - represents view
	class -> code that supports view ,created using ts
	      --> includes data properties and methods that controls the logic.
	metadata - used by angular to decide whether it is angular component or regular class.
	         - defined used a feature in typescript called decorator.
		 - just a function provide details about the class attached to it.		
		 -- uses component decorator.
	index.html -> main.ts -> app.module.ts --> app.component.ts -> html,class, metadata -> rendered in ui.

To create component:
	building blocks of angular application.
	ng g c <name of the component>
		-spec file not required.
		-4 new files created for the component along iwth updating app modules.
		- App modules :New component added imported and added in  Declaration array in the App modules.

	Any new component should be placed under app.component (also known as root component)
	
	Selector in App.component.ts or <owncomponent>.ts can be specified in 3 ways:
		1) selector : 'app-test' / corresponding as an <custom-tag> in app.component.html
		2) as class : selector :'.app-test' <div class = 'app-test'> </div> -- As an class attriute.
		3) using square bracket : selector : ['app-test'] / <div app-test> -- As an attribute.

	Template URL in App.component.ts:
		1) TemplateURL -> Inline template.(html in the typescript file itself)
			       -> '<div>Inline template</div>'		       
				if html span across multiline then use backtics (single quotes under tilde)
	Styles URL in App.component.ts:
		can be changed by Styles.-> also uses inline.
					--> uses backticks
		
	
Apr 22,2020 : Interpolation:
{{Expression}} :
			-- -- any expression or value with in {{ }} is called as Interpolation in Angular.
			Using interpolatino we can bind data from class to the template.
		-  how to greet name dynamically.
				-- define property in test component under class : public name = "Mani"
				-- refer the created property using {{ property name}}
				
		-- what interpolation can do :
				-- using math expression : <h2> {{2+2}} </h2>
				-- using String concatenation  {{"welcome" + name}}
				-- using inbuild javascript property {{ name.length}}
				-- using inbuild javascript methods {{name.toUpperCase}}									
				-- user defined method :
							define it under class
							then access that property under template.
								
		-- what interpolation Cannot to :
					<h2>{{a = 2+2}} -- error 
					-- check in console , cannot assignment
					-- Access to global variable ..window.location.href -- cannot read throws variable.
					-- if required define a property under class and access that under template.
				
April 23,2020: Property Binding	:
			
	

Apr 27,2020: Property binding:
		diff btwn html attribute vs Dom property
	<input type="text" value="Mani"> under test.component.ts
	In browser inspect mode  ($0 - represent current element)
	$0.getAttribute('value') --> fetch value attribute of current element --> wont be changed once initialized.
	$0.value --> Runtime value keep changes.
	change the value in the input value.
	attribute did not the change.
	where value property change.
	attribute and property are not the same.
	Attributes defined by html
	properties defined by DOM (Document object model)
	Attributes initialized Dom property and they are done , attributes value cannot change once they are initialized.
	however property value can change.
	
	property reference current value of the DOM element
	attribute refers to initial value
	
	PRoperty binding does to the Dom element
	
	property binding can be specified  [] or bind-<attribute>
	why cant we use interpolation instead of Property binding , why property binding is required.
		becoz Interpolation can handle only string ,not boolean :
		Ex: using disabled attribute in <input type ="text" value = "Mani" [disabled] = {{"true"}}> --> wont work as interpolation was used..
		<input type ="text" value = "Mani" [disabled] = "true">
	setting ID value as property binding.
			
			
Apr 29,2020 : Class binding

Binding class property to the html element.

	* Define 3 style property .test-success ,.test-failure,.test-danger
	* Standard way to apply class property : using class attribute.
	* Angular way : using class property [class] ="propertyName"
	* class binding takes precedence over class attribute if both are used for the html element.
	*             : property having boolean value : [class.booleanProperty] = "class that you want to apply"
	              : how you can apply multiple class binding : ngClass directive:
						use custom property = 
						{
							styleproperty1 = boolean value;
							styleproperty2 = boolean value;
						}
				  : directive is nothing but custom html attribute.
				  
May 01,2020 : Style binding.

	* Similar to class binding.
	* can be applied using style.color property directly , use single quotes within double quotes.
	* we can use component boolean property to apply style using style  binding.
	* ngStyle can be used to apply multiple  properties using component property
	
				  
May 01,2020 : Event binding.
	* Responding to user events like Mouse onclick , keyboard click etc.
	* Usually we are rendering the view based on component property ,sometimes we may require to respond to user based on his event 
			ex: when he click a button ,doing some actions , In this case data flow from template to component.
	* you can use $event variable - special type of Angular variable that holds all value of that event triggered.
	* you can use that properties to respond back to user / define your post actions.
	* you can use interpolation to use the component property
	* you can use template inline statement for the event instead of mouse handler.
	
	
May 03,2020
----------
Template Reference variables:
	used to Accessing the Dom html element and all its properties.
	can be accessed an element by defining variable using #
	<input #input type="text">
	<button  (click) = userMethod(#input)> click me </button>
	
Two way binding:
	[(ngModel)]
	Event Binding -> on click of an event , binding that value on the model property in the class.
	Data Binding -> Updated model property of the class , updated in the view.
	Basically keeping model and view always in sync.
	   <h2> Two way binding example</h2>
    <input [(ngModel)] = "inputValue" type="text">
	

Component Interaction:
	Enables Parent component (AppComponent) to child component(test Component) communication & vice versa
	achieved using @input decorator for reading parent property in child.
				   @output decorator for receiving child property in parent 
	
MAy 06,2020
-----------
Structural Directives:
	able to add /remove html element from Dom.
	
	ngIf/ngSwitch - Conditional. 
		ngIf - syntax : *ngIf="true or false" as an attribute.
		Else block:  wrap it with <ng-template> </ng-template>
								  add template reference variable <ng-template #userElseBlockVariable>
								  update the ifCondition as follows.
								  <h2 *ngIf= "userProperty; else userElseBlockVariable>
								  
								 you can specify true block and else block as separate ng-template.
								
								<ng-template #thenTrueBlock>
									
								</ng-template>
						
								<ng-template #falseBlock>
								</ng-template>
								
								<div *ngIf ="displayName; then <thenTrueBlock> ; else <falseBlock>"
							From running code:
							
								<h2 *ngIf = "displayName; else elseBlock" > Learning ngIf new statement</h2>
								<ng-template #elseBlock>
									<h2> Learning ngIf - false else statement</h2>
								</ng-template>
								
								<ng-template #ifBlock>
								  <h2>Learning ng if -true block</h2>
								</ng-template>
								
								<div *ngIf = "displayName; then ifBlock ;else elseBlock" ></div>
								
		ngSwitch:
				
				<div [ngSwitch] = "switchCondition">
				  <div *ngSwitchCase = "'red'">you picked up red color</div>
				  <div *ngSwitchCase = "'blue'">you picked up blue color</div>
				  <div *ngSwitchCase = "'green'">you picked up green color</div>
				  <div *ngSwitchDefault>pick again</div>
				</div>
				
	ngFor - Returns lists:	
				<div *ngFor = "let color of colors; index as i; first as f;last as l;odd as o; even as o">
					{{color}}  {{i}} {{f}} {{l}} {{o}} {{e}}
				</div>
				public colors = ["RED","GREEN","YELLOW","BLUE","ORANGE"]
				
	PIPES: 
		allowed to transform data in view.
		builtin pipes:
			
				  <h2> {{ greetMessage | uppercase}}</h2>
				  <h2> {{ greetMessage | lowercase}}</h2>
				  <h2> {{ greetMessage | titlecase}}</h2>
				  <h2> {{ greetMessage | slice:3}}</h2>
				  <h2> {{ greetMessage | slice:3:10}}</h2>
				  <h2> {{ jsonInput | json}}

				  <h2> {{ 123.13 | number : '1.2-3'}} </h2>
				  <h2> {{ 323.13 | number : '3.5-5'}} </h2>

				  <h2> {{ 0.25 | percent }} </h2>

				  <h2> {{ 25 | currency }} </h2>
				  <h2>{{ 25 | currency :'EUR' }} </h2>
				  <h2>{{ 25 | currency :'INR' : 'code' }} </h2>

				  <h2> {{ todaysDate }}</h2>
				  <h2> {{ todaysDate | date:'short'}}</h2>
				  <h2> {{ todaysDate | date:'shortDate'}}</h2>
				  <h2> {{ todaysDate | date:'shortTime'}}</h2>
				  <h2> {{ todaysDate | date:'medium'}}</h2>
				  <h2> {{ todaysDate | date:'mediumDate'}}</h2>
				  <h2> {{ todaysDate | date:'mediumTime'}}</h2>
				  <h2> {{ todaysDate | date:'long'}}</h2>
				  <h2> {{ todaysDate | date:'longDate'}}</h2>
				  <h2> {{ todaysDate | date:'longTime'}}</h2>


	Component Interaction:
	
			Communication between one component to another component.
			Achieved using input and output decorator. - @Input , @Output
			communication W.r.t to child component. --> @Input decorator to access data from parent.
														@Output decorator to send data to parent.
														
			From parent to child:
					1) Define a property in parent TS class. EX: public name = "Manikandan_Marimuthu";
					2) In parent html , choose the child by using its selector and bind it to a property 
						 <div class='app-myfirstcomponent' [parentData] = "name"></div>
					3) In child TS class , read the parent property using @Input() , Import that as well.
							@Input() public 'parentData';
							Instead of using the same parent variable ,you can use your own.
							@Input('parentData') public parentInputData;
					4) In child html , use Interpolation to read the parent data.
						 <h2>welcome to component interaction parent to child : {{parentInputData }}</h2>
			
			From child to Parent:
			
					Parent component has child component reference using selector so its easy for parent to communicate with child.
					But child doesnt have any such reference so we cant follow same approach.
					
					Child to parent communication can be achieved using EventEmitter.
					1) Define custom event of EventEmitter instance.
					 @Output()  public  childEvent = new EventEmitter();
					 
					2) Import EventEmitter & Output in child TS.
					
					3) Define an event in child html 
						 <button (click) = 'fireEvent()'>Send to Parent</button>
					4) Define that function to emit the message for parent.
						public fireEvent(){
							this.childEvent.emit("Parent Data received");
						  }
					 now the child component is emitting event , now it is upto to parent to capture it.
					 5) In parent TS , bind that custom event in the child component selector.
						 <div class='app-myfirstcomponent' (childEvent) = "message=$event" [parentData] = "name"></div>
					  6) also define the parent property - message. in parent ts class also
						public message;
		
02-Jun-2020 - SERVICES in Angular.
*****************
 Service: --<TODO>

		create employee -list component.
				In class create a employee array.
				using forloop under template ,iterate using ngfor loop and print it.
				In the app component ts, reference the employee-list component .
		If you want to display employee details in another view , create another component and cut and copy the same code
		but it violates below software principles.
		DRY PRINCIPE:
			Do not repeat yourself. --> redundancy code.
			Single responsibility principle -> there should be only 1 responsibility for each component
		what is a Service:
			IT is a class with specific purpose.
			1) share data.
			2) Implement application logic.
			3) Enables External Interaction.
			
			Naming convention : -- .service.ts
			
			
			 public students = [
    {"name":"Mani","age":40,"role":"Tech_Architect"},
    {"name":"Senthil","age":40,"role":"Analyst"},
    {"name":"Anand","age":40,"role":"Software Engineer"},
    {"name":"Kumar","age":40,"role":"Senior Software Engineer"}
  ]
  
  
  Dependency Injection :
		IT is a coding pattern where a class receives its dependencies from external sources rather than creating itself.
		Waht is Injector:
				It is a container for holding all your dependencies
		Using DI in angular for a service:
				Define the class as service
				Register with Injector.
				Declare as Dependency in the required places.
				
  Observables:
		Nothing but a http response that arrive asynchronously.
		
  using Http call for fetching data from service.
		1) Make a Http Get call to EmpService.
		2) Receive the observables and type cast it to the Employee object.
		3) Subscribe to the observable from EmpList & EmpDetails.
		4) Assign the employee array to a local variable.
		
  RxJs - It is a library external used to work with observables in Angular.
  
  Using Http:
		before Angular 4 - Http module was used.
		From Angular 4 onwards , HttpClient Module was used.
			
02-July-2020
------------
Routing & Navigation 
	Each Angular willl have multiple components each having its own view.
	Depending upon user action , you might have to take the user to different view where routing & navigation come into picture.
	
	To create a project with --Routing option:
		ng new <project-name>  --routing
	
	How to add --routing to existing project:
		1) Add <base href="/"> under head in Index.html
		2) under src/app create app-routing.module.ts -> This configures different route.
		3) Import app routing modules in app.module.ts & add to array.
		
	2  create component.
		