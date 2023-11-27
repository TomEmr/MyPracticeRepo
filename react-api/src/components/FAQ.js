import questions from "../faq_project/data";
import Question from "../faq_project/Question";
import "../faq_project/faq.css";

const FAQ = () => {
    return (
        <div className="all-box">
            <h1>FAQ</h1>
            {questions.map((question) => {
                return <Question key={question.id} {...question} />
            })}
        </div>
    )
}
export default FAQ;