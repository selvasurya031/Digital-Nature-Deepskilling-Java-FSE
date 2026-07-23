import React from "react";
import "./App.css";
import officeImage from "./assert/Office1.png";

function App() {

  // Single Office Object
  const office = {
    name: "Smart Tech Park",
    rent: 55000,
    address: "Chennai, Tamil Nadu"
  };

  // List of Office Objects
  const officeList = [
    {
      id: 1,
      name: "Smart Tech Park",
      rent: 55000,
      address: "Chennai"
    },
    {
      id: 2,
      name: "DLF IT Park",
      rent: 75000,
      address: "Bangalore"
    },
    {
      id: 3,
      name: "RMZ Infinity",
      rent: 90000,
      address: "Hyderabad"
    },
    {
      id: 4,
      name: "Tidel Park",
      rent: 45000,
      address: "Chennai"
    }
  ];

  return (
    <div className="container">

      <h1>Office Space Rental App</h1>

      {/* Image */}
      <img
        src={officeImage}
        alt="Office Space"
        className="office-image"
      />

      <hr />

      {/* Single Object */}

      <h2>Office Details</h2>

      <p><b>Name:</b> {office.name}</p>

      <p
        style={{
          color: office.rent < 60000 ? "red" : "green"
        }}
      >
        <b>Rent:</b> ₹{office.rent}
      </p>

      <p><b>Address:</b> {office.address}</p>

      <hr />

      {/* List of Offices */}

      <h2>Available Office Spaces</h2>

      {officeList.map((item) => (
        <div className="card" key={item.id}>

          <h3>{item.name}</h3>

          <p
            style={{
              color: item.rent < 60000 ? "red" : "green"
            }}
          >
            <b>Rent:</b> ₹{item.rent}
          </p>

          <p>
            <b>Address:</b> {item.address}
          </p>

        </div>
      ))}

    </div>
  );
}

export default App;