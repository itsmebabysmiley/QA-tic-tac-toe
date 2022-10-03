
# Unit tests

This readme file provide you information that you need to understand all the 10 unitTest methods that we had created.

## 1. testBoard

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

## 2. testReset

1. **Identify testable functions** : `reset()`
2. - **Identify parameters** : `None`
   - **return types** : `void`
   - **return values**: `None`
   - **exceptional behavior** : `None`
3. **Model the input domain**(The characteristics developed for this test case using the techniques from Input Space Partitioning. You must create **at least** one interface-based characteristic and **at least** one functionality-based characteristic for each test case.)  
   Characteristics:

| Characteristics | b1    | b2         | b3  |
|-----------------|-------|------------|-----|
| game is over    | True  | False      | -   | 
| playersTurn     | X     | Y          | -   | 
| winner          | Blank | X          | Y   | 
| movesAvailable  | 0     | \>0 and <8 | 8   |
4. Combine partitions to define test requirements - use the 5 approaches to find combinations of values (ACoC, ECC, PWC, BCC, MBCC). You must apply the 5 approaches to your 10 unit test cases (thus each approach will be used in 2 unit test cases).  
   Approaches : ECC
   Test requirements : 3 
   (True,X,Y,0) not valid.(how Y will win when X turns.),(False,Y,X,0-8) not valid,(True,X,Blank,8) not valid
5. Derive test values and expected values. These are the values that you have to use when you implement test cases in JUnit.

| Test               | gameOver | playersTurn | winner | movesAvailable | Expected result |
|--------------------|----------|-------------|--------|----------------|-----------------|
| T1(True,X,Y,0)     | True     | X           | Y      | 0              |                 |
| T2(False,Y,X,0-8)  | False    | Y           | X      | 2              |                 |
| T3(True,X,Blank,8) | True     | X           | Blank  | 8              |                 |

## 3. ?

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

## 4. ?

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
