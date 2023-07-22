const makePlural = (options, number) => {
    // možnosti, které mohou nastat
    const [singular, genitiveSingular, genitivePlural] = options;

    // poslední číslice
    const lastDigit = number % 10;

    // poslední dvě číslice
    const lastTwoDigits = number % 100;

    // platí pro 1, 21, 41, 121
    // neplatí pro 11, 111..
    if (lastDigit === 1 && lastTwoDigits !== 11) {
        return singular;
    }

    // platí pro 2,3,4,22,42,123
    // neplatí pro 12,13,14,122,123..
    if (lastDigit >= 2 && lastDigit <= 4 && (lastTwoDigits < 10 || lastTwoDigits >= 20)) {
        return genitiveSingular;
    }

    // platí pro 5,6,7,8,9,0,11,12,13,14,111,112,113,114
    return genitivePlural;

    // make your magic
}





// Ok, these were a couple of examples only to scare you. The Russian rule is easy too:
//
//     Number endings: 1 (example: 1, 21, 41, 121) (but not 11, 111 etc.) — singular.
//     Number endings: 2,3,4 (example: 22, 42, 123) (but not 12, 13 & 14) — genitive singular.
//     Number endings: 5,6,7,8,9,0 (includes 11, 12, 13, 14) — genitive plural.
//     Write a function that accepts an array of word forms [singular, genitive singular, genitive plural] and a number as parameters. It should return a string with the correct form.
//
//     _* There is an array ['день', 'дня', 'дней'] in test cases for easier debugging _