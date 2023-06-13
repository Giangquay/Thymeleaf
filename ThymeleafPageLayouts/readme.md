##Thymeleaf Page Layouts - Include Style

* Buoc 1
 Trong file commomcomponent.html
 
 ```html
       <header class="masthead mb-auto" th:fragment="header"> <!-- Note  -->
        <div class="inner">
          <h3 class="masthead-brand">My Page</h3>
          <nav class="nav nav-masthead justify-content-center">
            <a class="nav-link active" href="#">Home</a>
            <a class="nav-link" href="#">Features</a>
            <a class="nav-link" href="#">Contact US</a>
          </nav>
        </div>
        </header>
        <footer class="mastfoot mt-auto" th:fragment="footer"> <!-- Note  -->
        <div class="inner text-center">
          <p>Cover template for <a href="https://getbootstrap.com/"></a></p>
        </div>
      </footer>
 ```
* Buoc 2
Trong file index.html

```html 
<header th:replace="commomcomponent :: header"></header>
<footer th:replace="commomcomponent :: footer"></footer>
```

* Buoc 3

De nhung file Css ta dung nhu sau 

```html
	<link th:href="@{CSS/bootstrap.min.css}" rel="stylesheet">
	<script th:src="@{JS/boostrap.min.js}"></script>
```