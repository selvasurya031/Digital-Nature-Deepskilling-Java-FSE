import React, { useState } from "react";

// Login Button
function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

// Logout Button
function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

// Guest Page
function GuestGreeting() {
  return (
    <div>
      <h2>Welcome Guest!</h2>

      <h3>Available Flights</h3>

      <ul>
        <li>Chennai → Bangalore</li>
        <li>Delhi → Mumbai</li>
        <li>Hyderabad → Pune</li>
      </ul>

      <p>Please login to book your ticket.</p>
    </div>
  );
}

// User Page
function UserGreeting() {
  return (
    <div>
      <h2>Welcome User!</h2>

      <h3>Flight Booking</h3>

      <ul>
        <li>Chennai → Bangalore</li>
        <li>Delhi → Mumbai</li>
        <li>Hyderabad → Pune</li>
      </ul>

      <button>Book Ticket</button>
    </div>
  );
}

// Greeting Component
function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;

  if (isLoggedIn) {
    return <UserGreeting />;
  }

  return <GuestGreeting />;
}

// Main Component
function LoginControl() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  function handleLoginClick() {
    setIsLoggedIn(true);
  }

  function handleLogoutClick() {
    setIsLoggedIn(false);
  }

  return (
    <div>

      <Greeting isLoggedIn={isLoggedIn} />

      <br />

      {isLoggedIn ? (
        <LogoutButton onClick={handleLogoutClick} />
      ) : (
        <LoginButton onClick={handleLoginClick} />
      )}

    </div>
  );
}

export default LoginControl;