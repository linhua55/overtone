(ns overtone.core.ugen.categories)

(def UGEN-CATEGORY-MAP
     {"A2K" [["Conversion" ]]
      "AbstractIn" [["InOut" ]]
      "AbstractOut" [["InOut" ]]
      "AmpComp" [["Analysis" "Amplitude" ]]
      "AmpCompA" [["Analysis" "Amplitude" ]]
      "Amplitude" [["Analysis" "Amplitude" ]]
      "AudioIn" [["InOut" ]]
      "Ball" [["Filters" "Nonlinear" ]]
      "BeatTrack" [["Analysis" ]["FFT" ]]
      "BeatTrack2" [["Analysis" ]["FFT" ]]
      "BiPanB2" [["Multichannel" "Ambisonics" ]]
      "Blip" [["Generators" "Deterministic" ]]
      "BufCombN" [["Delays" ]]
      "BufDelayN" [["Delays" ]]
      "BufInfoUGenBase" [["Buffer" "Info" ]]
      "BufRd" [["Buffer" ]]
      "BufWr" [["Buffer" ]]
      "ChaosGen" [["Generators" "Chaotic" ]]
      "CheckBadValues" [["Info" ]]
      "CoinGate" [["Generators" "Stochastic" ]]
      "CombN" [["Delays" ]]
      "Compander" [["Analysis" "Amplitude" ]]
      "CompanderD" [["Analysis" "Amplitude" ]]
      "Convolution" [["FFT" ]]
      "Convolution2" [["FFT" ]]
      "Convolution2L" [["FFT" ]]
      "StereoConvolution2L" [["FFT" ]]
      "Convolution3" [["FFT" ]]
      "COsc" [["Generators" "Deterministic" ]]
      "Crackle" [["Generators" "Stochastic" ]]
      "DecodeB2" [["Multichannel" "Ambisonics" ]]
      "DUGen" [["Demand" ]]
      "DC" [["Generators" "Single-value" ]]
      "DegreeToKey" [["Conversion" ]]
      "Delay1" [["Delays" ]]
      "DelayN" [["Delays" ]]
      "Demand" [["Demand" ]]
      "DemandEnvGen" [["Demand" ]["Envelopes" ]]
      "DetectSilence" [["Synth control" ]["Analysis" "Amplitude" ]]
      "DiskIn" [["InOut" ]["Buffer" ]]
      "DiskOut" [["InOut" ]["Buffer" ]]
      "Done" [["Synth control" ]]
      "Dust" [["Generators" "Stochastic" ]]
      "Dust2" [["Generators" "Stochastic" ]]
      "Duty" [["Demand" ]]
      "Dwhite" [["Demand" ]]
      "DynKlang" [["Generators" "Deterministic" ]]
      "DynKlank" [["Generators" "Deterministic" ]["Filters" "Linear" ]]
      "EnvGen" [["Envelopes" ]]
      "ExpRand" [["Generators" "Stochastic" ]["Generators" "Single-value" ]]
      "FFT" [["FFT" ]]
      "FFTTrigger" [["FFT" ]]
      "Filter" [["Filters" "Linear" ]]
      "Formant" [["Generators" "Deterministic" ]]
      "Free" [["Synth control" ]]
      "FreeSelf" [["Synth control" ]]
      "FreeSelfWhenDone" [["Synth control" ]]
      "FreeVerb" [["Reverbs" ]]
      "FreeVerb2" [["Reverbs" ]]
      "FreqShift" [["Filters" "Nonlinear" ]["Filters" "Pitch" ]]
      "FSinOsc" [["Generators" "Deterministic" ]]
      "Gendy1" [["Generators" "Stochastic" ]]
      "Gendy2" [["Generators" "Stochastic" ]]
      "Gendy3" [["Generators" "Stochastic" ]]
      "GrainBuf" [["Buffer" ]["Generators" "Granular" ]]
      "GrainFM" [["Generators" "Granular" ]]
      "GrainSin" [["Generators" "Granular" ]]
      "GrainIn" [["Generators" "Granular" ]]
      "GVerb" [["Reverbs" ]]
      "Hasher" [["Filters" "Nonlinear" ]]
      "Hilbert" [["Filters" "Nonlinear" ]]
      "HilbertFIR" [["Filters" "Nonlinear" ]]
      "IEnvGen" [["Envelopes" ]]
      "IFFT" [["FFT" ]]
      "Impulse" [["Generators" "Deterministic" ]]
      "Index" [["Buffer" ]]
      "IndexL" [["Generators" "Deterministic" ]]
      "InfoUGenBase" [["Info" ]]
      "InRange" [["Maths" ]]
      "InRect" [["Maths" ]]
      "IRand" [["Generators" "Stochastic" ]["Generators" "Single-value" ]]
      "K2A" [["Conversion" ]]
      "KeyTrack" [["Analysis" "Pitch" ]]
      "KeyState" [["User interaction" ]]
      "Klang" [["Generators" "Deterministic" ]["Filters" "Linear" ]]
      "Klank" [["Generators" "Deterministic" ]["Filters" "Linear" ]]
      "LastValue" [["Triggers" ]]
      "Latch" [["Triggers" ]]
      "LFNoise0" [["Generators" "Stochastic" ]]
      "LFPulse" [["Generators" "Deterministic" ]]
      "LFSaw" [["Generators" "Deterministic" ]]
      "Line" [["Envelopes" ]]
      "Linen" [["Envelopes" ]]
      "LinExp" [["Maths" ]]
      "LinLin" [["Maths" ]]
      "LinRand" [["Generators" "Stochastic" ]["Generators" "Single-value" ]]
      "Logistic" [["Generators" "Chaotic" ]]
      "Loudness" [["Analysis" "Amplitude" ]]
      "MantissaMask" [["Filters" "Nonlinear" ]]
      "Median" [["Filters" "Nonlinear" ]]
      "MFCC" [["Analysis" ]]
      "MostChange" [["Maths" ]]
      "MouseButton" [["User interaction" ]]
      "MouseX" [["User interaction" ]]
      "Normalizer" [["Analysis" "Amplitude" ]]
      "NRand" [["Generators" "Stochastic" ]["Generators" "Single-value" ]]
      "Onsets" [["Analysis" ]]
      "Osc" [["Generators" "Deterministic" ]]
      "OscN" [["Generators" "Deterministic" ]]
      "PackFFT" [["FFT" ]]
      "PanB" [["Multichannel" "Ambisonics" ]]
      "PanB2" [["Multichannel" "Ambisonics" ]]
      "Panner" [["Multichannel" "Panners" ]]
      "Pause" [["Synth control" ]]
      "PauseSelf" [["Synth control" ]]
      "PauseSelfWhenDone" [["Synth control" ]]
      "PeakFollower" [["Analysis" "Amplitude" ]]
      "Phasor" [["Triggers" ]["Buffer" ]]
      "Pitch" [["Analysis" "Pitch" ]["MachineListening" ]]
      "PitchShift" [["Filters" "Pitch" ]]
      "PlayBuf" [["Buffer" ]]
      "Pluck" [["Generators" "Deterministic" ]]
      "PMOsc" [["Generators" "Deterministic" ]]
      "Poll" [["Info" ]]
      "PSinGrain" [["Generators" "Deterministic" ]]
      "Pulse" [["Generators" "Deterministic" ]]
      "PulseCount" [["Triggers" ]]
      "PulseDivider" [["Triggers" ]]
      "PV_BinScramble" [["FFT" ]]
      "PV_BinShift" [["FFT" ]]
      "PV_BinWipe" [["FFT" ]]
      "PV_BrickWall" [["FFT" ]]
      "PV_ChainUGen" [["FFT" ]]
      "PV_ConformalMap" [["FFT" ]]
      "PV_Diffuser" [["FFT" ]]
      "PV_HainsworthFoote" [["FFT" ]]
      "PV_JensenAndersen" [["FFT" ]]
      "PV_MagAbove" [["FFT" ]]
      "PV_MagDiv" [["FFT" ]]
      "PV_MagFreeze" [["FFT" ]]
      "PV_MagMul" [["FFT" ]]
      "PV_MagSmear" [["FFT" ]]
      "PV_MagSquared" [["FFT" ]]
      "PV_PhaseShift" [["FFT" ]]
      "PV_RandComb" [["FFT" ]]
      "PV_RandWipe" [["FFT" ]]
      "PV_RectComb" [["FFT" ]]
      "PV_RectComb2" [["FFT" ]]
      "Rand" [["Generators" "Stochastic" ]["Generators" "Single-value" ]]
      "RandID" [["Generators" "Stochastic" ]]
      "RandSeed" [["Generators" "Stochastic" ]]
      "RecordBuf" [["Buffer" ]]
      "Rotate2" [["Multichannel" "Ambisonics" ]["Multichannel" "Panners" ]]
      "RunningSum" [["Maths" ]]
      "Saw" [["Generators" "Deterministic" ]]
      "ScopeOut" [["Buffer" ]]
      "Select" [["Multichannel" "Select" ]]
      "SelectX" [["Multichannel" "Select" ]]
      "SelectXFocus" [["Multichannel" "Select" ]]
      "SendTrig" [["Triggers" ]]
      "Silent" [["Generators" "Single-value" ]]
      "SinOsc" [["Generators" "Deterministic" ]]
      "SinOscFB" [["Generators" "Deterministic" ]]
      "Slew" [["Filters" "Nonlinear" ]]
      "SpecCentroid" [["Analysis" ]["FFT" ]]
      "SpecFlatness" [["Analysis" ]["FFT" ]]
      "SpecPcile" [["Analysis" ]["FFT" ]]
      "Spring" [["Filters" "Nonlinear" ]]
      "Stepper" [["Triggers" ]]
      "Sweep" [["Triggers" ]]
      "SyncSaw" [["Generators" "Deterministic" ]]
      "T2A" [["Conversion" ]]
      "T2K" [["Conversion" ]]
      "Tap" [["Buffer" ]]
      "TBall" [["Filters" "Nonlinear" ]]
      "TDelay" [["Triggers" ]["Delays" ]]
      "TExpRand" [["Generators" "Stochastic" ]]
      "TGrains" [["Buffer" ]["Generators" "Granular" ]]
      "Timer" [["Triggers" ]]
      "TIRand" [["Generators" "Stochastic" ]]
      "ToggleFF" [["Triggers" ]]
      "TRand" [["Generators" "Stochastic" ]]
      "Trig1" [["Triggers" ]]
      "TWindex" [["Generators" "Stochastic" ]]
      "TWChoose" [["Multichannel" "Select" ]]
      "UGen" [["Unclassified" ]]
      "UnpackFFT" [["FFT" ]]
      "Unpack1FFT" [["FFT" ]]
      "VarSaw" [["Generators" "Deterministic" ]]
      "VOsc" [["Generators" "Deterministic" ]]
      "VOsc3" [["Generators" "Deterministic" ]]
      "Warp1" [["Buffer" ]["Generators" "Granular" ]]
      "WhiteNoise" [["Generators" "Stochastic" ]]
      "XFade" [["Multichannel" "Select" ]]
      "XLine" [["Envelopes" ]]
      "ZeroCrossing" [["Analysis" "Pitch" ]]})

;; #!/usr/bin/ruby
;; data = File.read("/Applications/Audio/SuperCollider/SCClassLibrary/Common/Audio/UGenCategories.sc").scan(/^\+ (\w+).+\#(\[.*\])/)

;; File.open("ugen_categories.clj", "w") do |f|
;;   data.each do |name, cats|
;;     cats = eval cats
;;     f << '"' << name << '"' << " ["
;;     cats.each do |catstrs|
;;       catstrs.each do |str|
;;         hierarchy = str.split('>')
;;         hierarchy.shift # drop the redundant UGens
;;         f << "["
;;         hierarchy.each do |cat|
;;           f << '"' << cat << '" '
;;         end
;;         f << "]"
;;       end
;;     end
;;     f << "]\n"
;;   end
;; end
