import React from 'react'

const Greeting = () => {
  return (
    <div>
      <button onClick={()=>{window.alert("Welcome")}}>Say Welcome</button>
    </div>
  )
}

export default Greeting
