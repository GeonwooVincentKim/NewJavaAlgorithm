# Difference between `Object equals()` and `String equals`

## Object Equals

- `Object equals` just contains that the two instances have same address of the memory.
- When the two instances of Object was allocated from same address of the memory, Then returns `true`
- OtherWise, it returns `false`
- Not `Object`, But also `Class equals` same

## String equals

- `String equals` is the overridden method from `Object` by parameter value
- When the two instance of `String(Character Sequence)` have `same address` of the memory, or `same character sequences(String)`, then return true.
- OtherWise, it returns `false` 

## Summarized information of difference between `Object` and `String`

- The equals() method of the String class is not same as the equals() method of the Object class. 
- It is overridden, this method accepts a String value and compares it with the current object and returns true only if the character sequences in the both String objects are exactly same.
