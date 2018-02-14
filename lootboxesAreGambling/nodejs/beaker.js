var dices;

function roll() {
    var results = []
    for (var i = 0, len = dices.length; i < len; i++) {
        results.push(random(dices[i]));}
}

function random (dice) {
    return Math.random() * (dice - 1) + low;
}

function addDice(dice) {
    dices.push(dice);
}
