import React from "react";

import { ListofPlayers, Scorebelow70 } from "./ListofPlayers";

import {
  OddPlayers,
  EvenPlayers,
  IndianPlayers,
  ListofIndianPlayers,
} from "./IndianPlayers";

function App() {

  // Change this to false to see second output
  var flag = true;

  const players = [
    { name: "Jack", score: 50 },
    { name: "Michael", score: 70 },
    { name: "John", score: 40 },
    { name: "Ann", score: 61 },
    { name: "Elisabeth", score: 61 },
    { name: "Sachin", score: 200 },
    { name: "Dhoni", score: 100 },
    { name: "Virat", score: 84 },
    { name: "Jadeja", score: 64 },
    { name: "Raina", score: 75 },
    { name: "Rohit", score: 80 },
  ];

  const IndianTeam = [
    "Sachin1",
    "Dhoni2",
    "Virat3",
    "Rohit4",
    "Yuvaraj5",
    "Raina6",
  ];

  if (flag === true) {
    return (
      <div style={{ margin: "20px" }}>
        <h1>React App</h1>
        <p>sachin M R</p>
        <h2>List of Players</h2>

        <ListofPlayers players={players} />

        <hr />

        <h2>List of Players having Scores Less than 70</h2>

        <Scorebelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div style={{ margin: "20px" }}>
        <h1>React App</h1>

        <h2>Odd Players</h2>

        {OddPlayers(IndianTeam)}
        <IndianPlayers></IndianPlayers>
        <hr />

        <h2>Even Players</h2>

        {EvenPlayers(IndianTeam)}

        <hr />

        <h2>List of Indian Players Merged</h2>

        <ListofIndianPlayers IndianPlayers={IndianPlayers} />
      </div>
    );
  }
}

export default App;