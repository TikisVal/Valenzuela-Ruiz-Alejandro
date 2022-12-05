(defrule dermatitis
  (symptom itching)
  (symptom drySkin)
  (symptom blisters)
      =>
  (printout t "Pacient has dermatitis" crlf)
)

(defrule cellulitis
  (symptom swelling)
  (symptom sensitivity)
  (symptom fever)
      =>
  (printout t "Pacient has cellulitis" crlf)
)
