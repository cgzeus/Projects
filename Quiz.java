
public class Quiz {
		
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	public static void main(String[] args) {
		
	Question question = new TrueFalseQuestion(
				
				"The average human brain is made up of 80% water", "TRUE"
				);
		question.check();	
		question = new MultipleChoiceQuestion(
				"What area of the brain is associated with speech?", "Broca's area",
						"Parietal lobe", "Hippocampus", "The Brain stem",
						"Corpus callosum", "A");
		question.check();
		question = new TrueFalseQuestion(
				"Your brain is 9% of your total body weight but uses 35% of your body's energy",
				"FALSE"
				);
		question.check();
		question = new MultipleChoiceQuestion("This lobe in the brain helps indentify objects and understand spatial relationships?", "Frontal Lobe",
				"Parietal Lobe", "Occipital Lobe", "Temporal Lobe", "Cerebellum","B");
		question.check();
		question = new MultipleChoiceQuestion("This small almond shaped structure is associated with the brain's reward system, stress, and the \"fight or flight\" response?"
				,"Pineal Gland", "Hippocampus", 
				"Hypothalamus", "Pituitary Gland", "Amygdala","E");
		question.check();
		question = new TrueFalseQuestion(
				"After age 30, the brain shrinks exactly .25% in mass each year","TRUE"
				);
		question.check();	
		question = new TrueFalseQuestion(
				"The brain feels pain as compared to the rest of the body","FALSE"
				);
		question.check();
		
		question = new MultipleChoiceQuestion("Next to headaches, what is the most common brain disorder?",
				"Alzheimer's Disease", "Parkinson's Disease", "Stroke", "Epilepsy",
				"Creutzfeldt-Jacob Disease", "D");
		question.check();
		question = new MultipleChoiceQuestion("What is Cotard's Syndrome?", "A disorder where people think that they are dead", 
				"A disorder where you can't remember faces", "A disorder where people experience the feelings of other people",
				"The belief that a loved one has been replaced by an imposter", "A condition where the patient believes that their hand does not belong to them", 
				"A");
		question.check();
		question = new TrueFalseQuestion(
				"Every time you recall a memory or have a new thought a new connection is made",
				"TRUE"
				);
		question.check();
		
		Question.showResults(); 
	}	
	
	
	}


