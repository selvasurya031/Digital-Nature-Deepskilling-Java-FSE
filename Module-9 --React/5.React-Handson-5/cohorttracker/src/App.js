import CohortDetails from "./CohortDetails";
import cohorts from "./cohorts";

function App() {
  return (
    <div style={{ padding: "20px" }}>
      <h1>Cohorts Details</h1>

      {cohorts.map((cohort) => (
        <CohortDetails
          key={cohort.id}
          cohort={cohort}
        />
      ))}
    </div>
  );
}

export default App;