function countSubstringOccur (substrText){
    var occurrences = substrText[1].toLowerCase().match(new RegExp(substrText[0], "g"))
    if(occurrences)
        return occurrences.length;
    else
        return 0;

}

console.log(countSubstringOccur(['in', "We are living in a yellow submarine. We don't have anything else. Inside the submarine is very tight. So we are drinking all the day. We will move out of it in 5 days."]));
console.log(countSubstringOccur(['your', 'No one heard a single word you said. They should have seen it in your eyes. What was going around your head.']));
console.log(countSubstringOccur(['but', "But you were living in another world tryin' to get your message through."]));