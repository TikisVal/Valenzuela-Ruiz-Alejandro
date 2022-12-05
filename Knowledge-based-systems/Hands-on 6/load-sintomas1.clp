
;;Defining a template for representing/modelling symptoms in Jess Working Memory

(deftemplate symptoms
   	(slot symptom1)
   	(slot symptom2)
   	(slot symptom3)
)

;;Storing three symptoms (four facts) in Jess Working Memory via deffacts function 

(deffacts pacients
    (symptoms  (symptom1 stomachache)  (symptom2  diarrea)   (symptom3 vomiting))
    (symptoms  (symptom1 chestPain)  (symptom2  shortnessOfBreath)   (symptom3 lossOfHeartbeat))
    (symptoms  (symptom1 itching)  (symptom2  drySkin)   (symptom3 blisters))
)
