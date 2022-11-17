import { getRoles } from "@testing-library/react";
import React from "react";
import { Link } from "react-router-dom";
import AuthService from "../Services/auth-service";

const Profile = () => {
  const currentUser = AuthService.getCurrentUser();

  const logOut = () => {
    AuthService.logout();
  };

  return (
    <div className="container">
      
        <h3>
          <strong>{currentUser.username}</strong> Profile
        </h3>
      
      
      
      <p>
        <strong>Email:</strong> {currentUser.email}
      </p>
      
    
      <a href="/login" className="nav-link" onClick={logOut}>
                LogOut
              </a>
      {/* <Link className='btn btn-outline-light' class="btn btn-outline-success" to="/addUser">Create New Account</Link> */}
        
    </div>
  );
};

export default Profile;
