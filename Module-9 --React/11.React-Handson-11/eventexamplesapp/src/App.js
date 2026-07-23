import logo from './logo.svg';
import './App.css';
import Increment from './Componants/Increment';
import Greeting from './Componants/Greeting';
import ClickMe from './Componants/ClickMe';
import CurrencyConverter from './Componants/CurrencyConverter';

function App() {
  return (
    <div className="App">
      <Increment></Increment>
      <Greeting></Greeting>
      <ClickMe></ClickMe>
      <CurrencyConverter></CurrencyConverter>
    </div>
  );
}

export default App;
