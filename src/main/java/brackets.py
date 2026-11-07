def solve(s: str) -> bool:
    brackets = {"(": ")", "[": "]", "{": "}"}
    stack = []

    for c in s:
        if c in brackets:
            stack.append(c)
        elif c in brackets.values():  # noqa: SIM102
            if not stack or brackets[stack.pop()] != c:
                return False
    return not stack


if __name__ == "__main__":
    tests = [
        ("", True),
        ("()", True),
        ("[]", True),
        ("{}", True),
        ("()[]{}", True),
        ("([]{})", True),
        ("{[()()]}", True),
        ("([)]", False),
        ("(]", False),
        ("((", False),
        ("}", False),
        (")(", False),
        ("())", False),
        ("abc", True),
        ("a(b[c]d)e", True),
        ("(a)", True),
    ]
    for s, expected in tests:
        try:
            got = solve(s)
            status = "OK" if got == expected else "ERROR"
            print(f"{s!r:14} expected {expected!s:5} got {got!s:5} {status}")
        except IndexError as error:
            print(
                f"{s!r:14} expected {expected!s:5} ERROR: {type(error).__name__}: {error}"
            )
