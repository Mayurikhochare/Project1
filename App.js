import React, { useState, useEffect } from "react";
import {BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
import AboutUs from "./Components/AboutUs";
import AuthService from "./Services/auth-service";
import Login from "./Components/Login";
// import Register from "./components/Register";
import Home from "./Components/Home";
import Profile from "./Components/Profile";
import BoardUser from "./Components/BoardUser";
//import BoardModerator from "./components/BoardModerator";
import AdminBoard from "./Components/AdminBoard";
import Admin from "./Components/Admin";
import Product from "./Components/Product";
import Cart from "./Components/Cart";
const App = (props) => {
  const [showModeratorBoard, setShowModeratorBoard] = useState(false);
  const [showAdminBoard, setShowAdminBoard] = useState(false);
  const [currentUser, setCurrentUser] = useState(undefined);

  useEffect(() => {
    const user = AuthService.getCurrentUser();

    if (user) {
      setCurrentUser(user);
      setShowModeratorBoard(user.roles.includes("ROLE_MODERATOR"));
      setShowAdminBoard(user.roles.includes("ROLE_ADMIN"));
    }
  }, []);

  const logOut = () => {
    AuthService.logout();

  };
  const [show, setShow] = useState(true);
  const [cart, setCart] = useState([]);

  const handleClick = (item) => {
    if (cart.indexOf(item) !== -1) return;
    setCart([...cart, item]);
  };

  const handleChange = (item, d) => {
    const ind = cart.indexOf(item);
    const arr = cart;
    arr[ind].amount += d;

    if (arr[ind].amount === 0) arr[ind].amount = 1;
    setCart([...arr]);
  };

 
  return (
    <div>
      <nav class="navbar navbar-expand-lg bg-light shadow-lg p-3 mb-5 bg-body rounded ">
      <div className="container-fluid">
        <a class="navbar-brand img1" href="#"><img  height="50px" width="50px" src="https://www.funcorp.in/pub/media/logo/stores/1/logo_new.png"></img></a>
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
        <div className="navbar-nav mr-auto">
          
          {/* {showModeratorBoard && (
            <li className="nav-item">
              <Link to={"/mod"} className="nav-link">
                Moderator Board
              </Link>
            </li>
          )}*/}
          {showAdminBoard && (
            <li class="nav-item">
            <Link  class="nav-link navbar-nav me-auto mb-2 mb-lg-0 navbar-brand" to={"/Admin"}>Admin</Link>
            </li>
          )} 

          {/* {currentUser && (
            <li className="nav-item">
              <Link to={"/user"} className="nav-link">
                User
              </Link>
            </li>
          )} */}
          </div>
          
        {currentUser ? (
          <div className="container-fluid">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ">
                
        <li class="nav-item ">
        <Link  class="nav-link navbar-nav me-auto mb-2 mb-lg-0 navbar-brand" to="/">Home</Link>
        </li>
       
        <li class="nav-item">
        <Link  class="nav-link navbar-nav me-auto mb-2 mb-lg-0 navbar-brand" to="/AboutUs">About Us</Link>
        </li>
        <li class="nav-item">
        <Link  class="nav-link navbar-nav me-auto mb-2 mb-lg-0 navbar-brand" to="/Product">Products</Link>
        </li>
        </ul>
        
        <ul class="navbar-nav me-auto mb-2 mb-lg-0 ">
            
    <li class="nav-item nav2">
          <a class="nav-link navbar-nav me-auto mb-2 mb-lg-0 navbar-brand " href="Cart"><i class="fa fa-shopping-cart"><sup>{'0'}</sup></i></a>
    </li>
    
    <li class="nav-item nav2">
        <Link  class="nav-link navbar-nav me-auto mb-2 mb-lg-0 navbar-brand " to="/Profile"><img className="profile-img" height="8000px" width="80px" src="https://spng.pngfind.com/pngs/s/671-6717401_male-user-icon-hd-png-download.png"></img></Link>
    </li>
    
            </ul>
          </div>
        
        ) : (
          <div className="navbar-nav ml-auto">
            <li className="nav-item">
              <Link to={"/login"} className="nav-link">
                Login
              </Link>
            </li>

          </div>
        )}
        </div>
      </nav>
      <div className="container mt-3">
        <Routes>
          <Route path="/" element={<Home/>} />
          <Route path="/Home" element={<Home/>} />
          <Route path="/login" element={<Login/>} />
          <Route path="/profile" element={<Profile/>} />
          {/* <Route path="/user" element={<BoardUser/>} /> */}
          {/* <Route path="/admin" element={<AdminBoard/>} /> */}
          <Route path="/AboutUs" element={<AboutUs/>} />
          <Route path="/Admin" element={<Admin/>} />
          {show ? (<Route path="/Product" element={<Product handleClick={handleClick}/>} />)
          : (<Route path="/Cart" element={<Cart cart={cart} setCart={setCart} handleChange={handleChange} />} />)}
          
          <Route exact path="/Profile" element={<Profile/>}></Route>
          {/* <Route exact path="/Register" element={<Register/>}></Route> */}
        </Routes>
      </div>
    </div>
  );
};

export default App;