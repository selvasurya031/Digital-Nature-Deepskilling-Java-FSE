import React, { useState } from 'react'
const Increment = () => {
    const [count,setCount] = useState(0);
function increment(){
    setCount(count+1);
    alert("Hi form Sachin");

}
  return (
    <div>
        <h1>{count}</h1>
    <button onClick={increment}> Increment</button><br></br>
    <button onClick={() =>setCount(count-1)}> Decrement</button>

    </div>
  )
}

export default Increment
