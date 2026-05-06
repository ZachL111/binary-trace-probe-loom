# Binary Trace Probe Loom Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 174 | ship |
| stress | latency skew | 184 | ship |
| edge | signal loss | 210 | ship |
| recovery | incident shape | 208 | ship |
| stale | span volume | 207 | ship |

Start with `edge` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `baseline` becomes less cautious without a clear reason, I would inspect the drag input first.
