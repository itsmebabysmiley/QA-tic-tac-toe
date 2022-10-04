
# Unit tests

This readme file provide you information that you need to understand all the 10 unitTest methods that we had created.

## 1. testBoard

To test if the code can create a board or not.

1. **Identify testable functions** : `Board()` 
2.  - **Identify parameters** : `None`  
    - **return types** : `void`  
    - **return values**: `None`  
    - **exceptional behavior** :`None`
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
Characteristics:


| Characteristics                     | b1   | b2    |
|-------------------------------------|------|-------|
| board is not empty                  | True | False |
| Height and width are the same value | 3    | -     |
4. Combine partitions to define test requirements - use the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
Approaches : ACoC  
Test requirements : 2x1 = 4  
(True,3),(False,3)
5. Derive test values and expected values. These are the values that you have to use when you implement test cases in JUnit.  

| Test        | Board       | BOARD_WIDTH | Expected result    |
|-------------|-------------|-------------|--------------------|
| T1(True,3)  | new Board() | 3           | Board is not null. |
| T2(False,3) | null        | 3           | Board is null.     |

## 2. TestMove

To check whether the move is valid or not.
1. **Identify testable functions** : `move`
2. - **Identify parameters** : `x(int), y(int)`
- **return types** : `Boolean`
- **return values**: `True` or `False`
- **exceptional behavior** : ?
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics            | b1   | b2    |
|----------------------------|------|-------|
| x and y position are empty | True | False | 
| x is in range(0-8)         | 0-8  |       | 
| y is in range(0-8)         | 0-8  |       | 
4. Combine partitions to define test requirements - use the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches : _(ACoC, ECC, PWC, BCC, MBCC)_  
   Test requirements : ACoC  
   (T,0-8,0-8),(F,0-8,0-8)

5. Derive test values and expected values. These are the values that you have to use when you implement test cases in JUnit.

| Test        | x   | y   | Expected result |
|-------------|-----|-----|-----------------|
| (T,0-8,0-8) | 0   | 0   | True            |
| (F,0-8,0-8) | 0   | 0   | False           |

## 3. testReset(Might be delete)

To test it reset properly.

1. **Identify testable functions** : `reset()`
2. - **Identify parameters** : `None`
   - **return types** : `void`
   - **return values**: `None`
   - **exceptional behavior** : `None`
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics | b1    | b2    | b3  |
|-----------------|-------|-------|-----|
| game is over    | True  | False | -   | 
| playersTurn     | X     | Y     | -   | 
| winner          | Blank | X     | Y   | 
| movesAvailable  | 0     | 0-8   | 8   |
4. Combine partitions to define test requirements - use the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches : ECC
   Test requirements : 3
   (T,X,X,0),(F,X,Blank,0-8),(F,Y,Blank,8)
5. Derive test values and expected values. These are the values that you have to use when you implement test cases in JUnit.

| Test            | gameOver | playersTurn | winner | movesAvailable | Expected result                                                                          |
|-----------------|----------|-------------|--------|----------------|------------------------------------------------------------------------------------------|
| (T,X,X,0)       | True     | X           | X      | 0              | Board variables (gameOver=False,moveCount=0,playersTurn=X,winner=Blank,movesAvailable=9) |
| (F,X,Blank,0-8) | False    | X           | Blank  | 8              | Board variables (gameOver=True,moveCount=1,playersTurn=X,winner=Blank,movesAvailable=8)  |
| (F,Y,Blank,8)   | False    | Y           | Blank  | 8              | Board variables                                                                          |




## 4. testRandom

To test whether it will random to the empty position or not.

1. **Identify testable functions** : random
2. - **Identify parameters** : None
- **return types** : None
- **return values**: None
- **exceptional behavior** : ?
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics                        | b1  | b2  |
|----------------------------------------|-----|-----|
| no. of movable equal to empty position | ?   | ?   |
| ?                                      | ?   | ?   |
4. Combine partitions to define test requirements - use the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches : _(ACoC, ECC, PWC, BCC, MBCC)_  
   Test requirements : ?  
   ?, ?, ?,
5. Derive test values and expected values. These are the values that you have to use when you implement test cases in JUnit.

| Test | Param1 | Param2 | Expected result |
|------|--------|--------|-----------------|
| ?    | -      | -      | ?               |
| ?    | -      | -      | ?               |

## 5. ?

1. **Identify testable functions** : ?
2. - **Identify parameters** : ?
- **return types** : ?
- **return values**: ?
- **exceptional behavior** : ?
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:


| Characteristics | b1  | b2  |
|-----------------|-----|-----|
| ?               | ?   | ?   |
| ?               | ?   | ?   |
4. Combine partitions to define test requirements - use the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches : _(ACoC, ECC, PWC, BCC, MBCC)_  
   Test requirements : ?  
   ?, ?, ?,
5. Derive test values and expected values. These are the values that you have to use when you implement test cases in JUnit.

| Test | Param1 | Param2 | Expected result |
|------|--------|--------|-----------------|
| ?    | -      | -      | ?               |
| ?    | -      | -      | ?               |

## 6. ?

1. **Identify testable functions** : ?
2. - **Identify parameters** : ?
- **return types** : ?
- **return values**: ?
- **exceptional behavior** : ?
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:


| Characteristics | b1  | b2  |
|-----------------|-----|-----|
| ?               | ?   | ?   |
| ?               | ?   | ?   |
4. Combine partitions to define test requirements - use the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches : _(ACoC, ECC, PWC, BCC, MBCC)_  
   Test requirements : ?  
   ?, ?, ?,
5. Derive test values and expected values. These are the values that you have to use when you implement test cases in JUnit.

| Test | Param1 | Param2 | Expected result |
|------|--------|--------|-----------------|
| ?    | -      | -      | ?               |
| ?    | -      | -      | ?               |

## 7. ?

1. **Identify testable functions** : ?
2. - **Identify parameters** : ?
- **return types** : ?
- **return values**: ?
- **exceptional behavior** : ?
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:


| Characteristics | b1  | b2  |
|-----------------|-----|-----|
| ?               | ?   | ?   |
| ?               | ?   | ?   |
4. Combine partitions to define test requirements - use the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches : _(ACoC, ECC, PWC, BCC, MBCC)_  
   Test requirements : ?  
   ?, ?, ?,
5. Derive test values and expected values. These are the values that you have to use when you implement test cases in JUnit.

| Test | Param1 | Param2 | Expected result |
|------|--------|--------|-----------------|
| ?    | -      | -      | ?               |
| ?    | -      | -      | ?               |

## 8. ?

1. **Identify testable functions** : ?
2. - **Identify parameters** : ?
- **return types** : ?
- **return values**: ?
- **exceptional behavior** : ?
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:


| Characteristics | b1  | b2  |
|-----------------|-----|-----|
| ?               | ?   | ?   |
| ?               | ?   | ?   |
4. Combine partitions to define test requirements - use the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches : _(ACoC, ECC, PWC, BCC, MBCC)_  
   Test requirements : ?  
   ?, ?, ?,
5. Derive test values and expected values. These are the values that you have to use when you implement test cases in JUnit.

| Test | Param1 | Param2 | Expected result |
|------|--------|--------|-----------------|
| ?    | -      | -      | ?               |
| ?    | -      | -      | ?               |

## 9. ?

1. **Identify testable functions** : ?
2. - **Identify parameters** : ?
- **return types** : ?
- **return values**: ?
- **exceptional behavior** : ?
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:


| Characteristics | b1  | b2  |
|-----------------|-----|-----|
| ?               | ?   | ?   |
| ?               | ?   | ?   |
4. Combine partitions to define test requirements - use the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches : _(ACoC, ECC, PWC, BCC, MBCC)_  
   Test requirements : ?  
   ?, ?, ?,
5. Derive test values and expected values. These are the values that you have to use when you implement test cases in JUnit.

| Test | Param1 | Param2 | Expected result |
|------|--------|--------|-----------------|
| ?    | -      | -      | ?               |
| ?    | -      | -      | ?               |

## 10.

1. **Identify testable functions** : ?
2. - **Identify parameters** : ?
- **return types** : ?
- **return values**: ?
- **exceptional behavior** : ?
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:


| Characteristics | b1  | b2  |
|-----------------|-----|-----|
| ?               | ?   | ?   |
| ?               | ?   | ?   |
4. Combine partitions to define test requirements - use the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches : _(ACoC, ECC, PWC, BCC, MBCC)_  
   Test requirements : ?  
   ?, ?, ?,
5. Derive test values and expected values. These are the values that you have to use when you implement test cases in JUnit.

| Test | Param1 | Param2 | Expected result |
|------|--------|--------|-----------------|
| ?    | -      | -      | ?               |
| ?    | -      | -      | ?               |
