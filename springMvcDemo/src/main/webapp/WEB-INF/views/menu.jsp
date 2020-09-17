<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Online Shope</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath()%>/home">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath()%>/user/allProduct">All Products</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath()%>/admin/allUser">All Users</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Product
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Add</a>
          <a class="dropdown-item" href="#">ShowAll</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Edit</a>
        </div>
      </li>
    </ul>
    <ul class="navbar-nav ml-auto">
    	<li class="nav-item">
    		<a class="nav-link" href="<%=request.getContextPath()%>/user/cart"><i class="fas fa-shopping-cart"></i> Cart</a>
    	</li>
    	<li class="nav-item">
    		<a class="nav-link" href="<%=request.getContextPath()%>/regis">SingUp</a>
    	</li>
    	<li class="nav-item">
    		<a class="nav-link" href="<%=request.getContextPath()%>/login">SingIn</a>
    	</li>
    </ul>
  </div>
</nav>