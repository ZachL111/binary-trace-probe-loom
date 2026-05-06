# binary-trace-probe-loom

`binary-trace-probe-loom` explores observability with a small Scala codebase and local fixtures. The technical goal is to package a Scala local lab for probe analysis with append-only fixtures, checkpoint recovery checks, and documented operating limits.

## Purpose

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Binary Trace Probe Loom Review Notes

For a quick review, compare `signal loss` with `span volume` before reading the middle cases.

## What Is Covered

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/binary-trace-probe-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `signal loss` and `span volume`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Implementation Notes

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `span volume`, `latency skew`, `signal loss`, and `incident shape`.

The added Scala path is deliberately direct, with fixtures doing most of the explaining.

## Command

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Audit Path

The check exercises the source code and the review fixture. `edge` is the high score at 210; `baseline` is the low score at 174.

## Limits

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.
