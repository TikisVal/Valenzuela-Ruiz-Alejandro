(defrule stomachFlu
  (symptom diarrea)
  (symptom stomachache)
  (symptom vomiting)
      =>
  (printout t "Pacient has stomach flu" crlf)
)

(defrule colitis
  (symptom rectal bleeding)
  (symptom constipation)
  (symptom stomachache)
      =>
  (printout t "Pacient has colitis" crlf)
)
