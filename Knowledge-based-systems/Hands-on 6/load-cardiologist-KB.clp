(defrule arrhythmia
  (symptom chestPain)
  (symptom lossOfHeartbeat)
  (symptom shortnessOfBreath)
      =>
  (printout t "Pacient has arrhythmia" crlf)
)

(defrule heartAttack
  (symptom chestDiscomfort)
  (symptom shortnessOfBreath)
  (symptom upperBodyDiscomfort)
      =>
  (printout t "Pacient has a heartAttack" crlf)
)
