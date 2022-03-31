List = ['hello', 'goodbye', 'another', 'day']

for i in range(len(List)) :
    j = len(List[i]) - 1
    while (j >= 0) :
        print(List[i][j], end='')
        j -= 1
    print("\n")
print(List)
