(ns overtone.core
  (:use overtone.ns)
  (:require clojure.stacktrace
            midi overtone.osc byte-spec
            [overtone config time-utils log]
            [overtone.helpers chance scaling]
            [overtone.sc.ugen.constants]
            [overtone.sc allocator core ugen node synth synthdef cgen
             trigger buffer envelope bus sample sc-lang example]
            [overtone.sc.cgen audio-in oscillators demand]
            [overtone.sc.examples demand osc trig compander audio-in]
            [overtone.music rhythm pitch tuning]
            [overtone.studio core util fx]
            [overtone.viz scope]))

(immigrate

 'overtone.osc
 'midi
 'overtone.sc.ugen.constants
 'overtone.log
 'overtone.time-utils
 'overtone.util
 'overtone.helpers.chance
 'overtone.helpers.scaling
 'overtone.event
 'overtone.sc.core
 'overtone.sc.node
 'overtone.sc.buffer
 'overtone.sc.trigger
 'overtone.sc.ugen
 'overtone.sc.synth
 'overtone.sc.sample
 'overtone.sc.synthdef
 'overtone.sc.envelope
 'overtone.sc.sc-lang
 'overtone.sc.bus
 'overtone.sc.cgen
 'overtone.sc.cgen.audio-in
 'overtone.sc.cgen.oscillators
 'overtone.sc.cgen.demand
 'overtone.sc.example
 'overtone.sc.examples.demand
 'overtone.sc.examples.osc
 'overtone.sc.examples.trig
 'overtone.sc.examples.compander
 'overtone.sc.examples.audio-in
 'overtone.music.rhythm
 'overtone.music.pitch
 'overtone.music.tuning
 'overtone.studio.core
 'overtone.studio.fx
 'overtone.viz.scope
 )
