def solve(n: int, m: int) -> int:
    queue = [i for i in range(1, n + 1)]

    while n > 1:
        for i in range(m - 1):
            queue.append(queue.pop(0))
        queue.pop(0)
        n -= 1
    return queue.pop()


if __name__ == "__main__":
    tests = [
        (1, 1, 1),
        (1, 5, 1),
        (2, 1, 2),
        (2, 2, 1),
        (5, 1, 5),
        (5, 2, 3),
        (7, 3, 4),
        (10, 3, 4),
        (5, 7, 4),
    ]
    for n, m, expected in tests:
        try:
            got = solve(n, m)
            status = "OK" if got == expected else "ERROR"
            print(f"n={n:<2} m={m:<2} expected {expected:<2} got {got:<2} {status}")
        except IndexError as error:
            print(
                f"n={n:<2} m={m:<2} expected {expected:<2} "
                f"ERROR: {type(error).__name__}: {error}"
            )
