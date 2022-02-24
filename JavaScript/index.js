// The join method returns an array as a string. It does not change the original array. A seperator can be used (optional), default is comma.
// The split methods returns a string as a array of substrings. It returns the new arary. It does not change the original string. A separator can be used.

function reverseString(str) {
    // const strArray = str.split('');
    // strArray.reverse();
    // return strArray.join('');

    /////////////////////////////

    // let revString = '';
    // for (let i = str.length - 1; i >= 0; i--) {
    //     revString = revString + str[i];
    // }
    // return revString;

    ////////////////////////////

    // let revString = '';
    // for (let i = 0; i <= str.length - 1; i++) {
    //     revString = str[i] + revString;
    // }
    // return revString;

    ////////////////////////////

    // let revString = ''; 
    // for(let char of str) {
    //     revString = char + revString;
    // }
    // return revString;

    ////////////////////////////

    // let revString = '';
    // str.split('').forEach(element => {
    //     revString = element + revString;
    // });
    // return revString;

    ////////////////////////////

    return str.split('').reduce((revString, char) => {
        return char + revString;
    });


} 

const ans = reverseString('Hello');
console.log(ans);