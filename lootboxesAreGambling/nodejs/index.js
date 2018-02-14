const express = require('express');
const app = express();
const os = require('os');

var dices = [];

app.get('/health', (req, res) => {

  res.json(os.networkInterfaces());
});

app.get('/', (req, res) => {
  res.json({hello: 'World!'});
});

app.post('/addDice', (req, res) => {
  if(!req.query.dice) {
    res.json({error: "There is no dice"})
  } else {
    dices.push(req.query.dice);
    res.json({success:"Dice Added"})
  }
});

app.get('/roll', (req, res) => {
  var results = []
    for (var i = 0, len = dices.length; i < len; i++) {
        results.push(random(dices[i]));}

 res.json(results);
});

function random (dice) {
    return  Math.floor(Math.random() * (dice - 1) + 1);
}

app.listen(5000, () => console.log('Example app listening on port 5000!'));

module.exports = app;
