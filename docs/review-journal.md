# Review Journal

The review surface for `binary-trace-probe-loom` is deliberately narrow: one fixture, one scoring rule, and one local check.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 174, lane `ship`
- `stress`: `latency skew`, score 184, lane `ship`
- `edge`: `signal loss`, score 210, lane `ship`
- `recovery`: `incident shape`, score 208, lane `ship`
- `stale`: `span volume`, score 207, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.
