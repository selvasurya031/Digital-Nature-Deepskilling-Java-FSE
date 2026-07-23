import React, { useState } from 'react'

const CurrencyConverter = () => {
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("");

  function convertor() {
  const amount = document.getElementById("amount").value;
  const currency = document.getElementById("currency").value;

  if (currency.trim() === "") {
    alert("Enter the Currency");
    return;
  }

  alert(`$ ${amount}`);
  }
  return (
    <div>
      <h1>Currency Convertor!!!</h1><br></br>
      <label htmlFor="amount">Amount</label>
      <input id='amount'></input><br></br><br></br>
      <label htmlFor='currency'>Currency</label>
      <textarea id='currency'         type="text"

        placeholder="USD">
            </textarea>
            <br></br><br />


<button onClick={convertor}>Submit</button>

    </div>
  )
}

export default CurrencyConverter
