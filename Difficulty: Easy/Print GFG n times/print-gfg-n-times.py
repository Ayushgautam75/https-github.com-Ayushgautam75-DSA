def printGFG(n):
    if n == 0:
        return
    print("GFG", end=" ")
    printGFG(n - 1)

n = int(input())
printGFG(n)