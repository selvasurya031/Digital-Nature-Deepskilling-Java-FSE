import logo from './logo.svg';
import './App.css';
import Dashboard from './Components/Dashboard';
import LoginControl from './Components/LoginControl';

function App() {
  return (
    <div className="App">
      <h1>Ticket Booking App</h1>
      <LoginControl></LoginControl>
    </div>
  );
}

export default App;
