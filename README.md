# Card Validation Program

Author: Tendai Nyevedzanai

## Overview

This Java program reads card data from a file, processes it, and determines whether the cards are valid or invalid based on specific criteria. The program checks for uniqueness of card characteristics and validates the input.

## Code Explanation

1. **Input**
   - The program prompts the user to enter the name of the cards file.
   - It reads the card data from the specified file.

2. **Processing**
   - Each line in the file represents a set of three cards.
   - The program splits each line into separate cards.
   - For each card, it further splits the characteristics (values separated by commas).
   - It maintains an `ArrayList` called `matcher` to store unique card characteristics.
   - The `insertCounter` keeps track of the number of unique characteristics added.
   - The `skippedCounter` counts the number of duplicate characteristics encountered.

3. **Validation**
   - If the total number of unique characteristics is 9 or if there are 3 unique characteristics and 6 duplicates, the set of cards is considered valid.
   - Otherwise, it is marked as invalid.

4. **Output**
   - The program prints the processing status (valid or invalid) for each set of cards.
   - After processing all sets, it displays "Done."

## Example Output

```
Enter the name of the cards file: cards.txt
Processing: 2,3,4 5,6,7 8,9,10
Valid
Processing: A,B,C D,E,F G,H,I
Invalid
Done
