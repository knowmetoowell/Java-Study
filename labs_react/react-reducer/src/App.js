import logo from './logo.svg';
import './App.css';
import React, { useReducer, useState } from 'react';

// function countReducer(oldCount, action) {
//   if (action === 'UP') {
//     return oldCount + 1;
//   } else if (action === 'DOWN') {
//     return oldCount - 1;
//   } else if (action === 'RESET') {
//     return 0;
//   }
// }
// function down() {
//   countDispatch('DOWN');
// }
// function reset() {
//   countDispatch('RESET');
// }
// function up() {
//   countDispatch('UP');
// }

function App() {
  function countReducer(oldCount, action) {
    if (action.type === 'UP') {
      return oldCount + action.number;
    } else if (action.type === 'DOWN') {
      return oldCount - action.number;
    } else if (action.type === 'RESET') {
      return 0;
    }
  }
  const [number, setNumber] = useState(10);
  const [count, countDispatch] = useReducer(countReducer, 0);
  function down() {
    countDispatch({ type: 'DOWN', number: number });
  }
  function reset() {
    countDispatch({ type: 'RESET', number: number });
  }
  function up() {
    countDispatch({ type: 'UP', number: number });
  }
  function changeNumber(event) {
    setNumber(Number(event.target.value));
  }
  return (
    <div className="App">
      <input type="button" value="-" onClick={down} />
      <input type="button" value="0" onClick={reset} />
      <input type="button" value="+" onClick={up} />
      <input type="text" value={number} onChange={changeNumber} />
      <span>{count}</span>
    </div>
  );
}

export default App;
