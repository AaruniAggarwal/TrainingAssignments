function isUpperCaseAt(str, index) {
    if(str.charAt(index).toUpperCase() === str.charAt(index))
    {
        return true;
    }
    else
    return false
    }
console.log(isUpperCaseAt('Aaruni', 4));